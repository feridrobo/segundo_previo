package com.example.futbol.controller;

import com.example.futbol.entities.Seleccion;
import com.example.futbol.repository.SeleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/selecciones")
public class SeleccionController {

    @Autowired
    SeleccionRepository seleccionRepository;

    @GetMapping
    public List<Seleccion> getSeleccionAll() {
        return seleccionRepository.findAll();
    }

    @GetMapping("/{grupo}/")
    public List<Seleccion> getSeleccionbyGrupo(@PathVariable String grupo) {
        List<Seleccion> seleccions = seleccionRepository.findAll();

        for(Seleccion seleccion: seleccions) {
            if(!seleccion.getGrupo().equals(grupo)) {
                seleccions.remove(seleccion);
            }
        }
        return seleccions;
    }

    @PostMapping
    public Seleccion postSeleccion(@RequestBody Seleccion seleccion) {
        seleccionRepository.save(seleccion);
        return seleccion;
    }
}
