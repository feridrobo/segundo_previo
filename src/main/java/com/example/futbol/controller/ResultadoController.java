package com.example.futbol.controller;

import com.example.futbol.entities.Resultado;
import com.example.futbol.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/resultados")
public class ResultadoController {

    @Autowired
    ResultadoRepository resultadoRepository;

    @GetMapping
    public List<Resultado> getResultadoAll() {
        return resultadoRepository.findAll();
    }

    @PostMapping
    public Resultado postResultado(@RequestBody Resultado resultado) {
        resultadoRepository.save(resultado);
        return resultado;
    }

    @PutMapping("/{id}")
    public Resultado putResultadobyId(@PathVariable Integer id, @RequestBody Resultado resultado) {
        Optional<Resultado> resultadoCurrent = resultadoRepository.findById(id);

        if (resultadoCurrent.isPresent()) {
            Resultado resultadoReturn = resultadoCurrent.get();
            resultadoReturn.setPartido(resultado.getPartido());
            resultadoReturn.setSeleccion(resultado.getSeleccion());
            resultadoReturn.setGoles(resultado.getGoles());
            resultadoReturn.setAmarillas(resultado.getAmarillas());
            resultadoReturn.setRojas(resultado.getRojas());
            resultadoRepository.save(resultadoReturn);
            return resultadoReturn;
        }

        return null;
    }
}