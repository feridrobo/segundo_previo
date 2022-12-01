package com.example.futbol.controller;

import com.example.futbol.entities.Partido;
import com.example.futbol.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RestController
    @RequestMapping("/partidos")
    public class PartidoController {

        @Autowired
        PartidoRepository partidoRepository;

        @GetMapping
        public List<Partido> getPartidoAll() {
            return partidoRepository.findAll();
        }

        @GetMapping("/{id}/resultados")
        public Partido getPartidobyId(@PathVariable Integer id) {
            Optional<Partido> partido = partidoRepository.findById(id);

            if (partido.isPresent()) {
                return partido.get();
            }

            return null;
        }
    }
