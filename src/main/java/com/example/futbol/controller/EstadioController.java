package com.example.futbol.controller;

import com.example.futbol.entities.Estadio;
import com.example.futbol.repository.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class EstadioController {

    @Autowired
    EstadioRepository estadioRepository;

    @GetMapping
    public List<Estadio> getEstadioAll() {
        return estadioRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public Estadio deleteEstadiobyId(@PathVariable Integer id) {
        Optional<Estadio> estadio = estadioRepository.findById(id);

        if (estadio.isPresent()) {
            Estadio estadioReturn = estadio.get();
            estadioRepository.deleteById(id);
            return estadioReturn;
        }

        return null;
    }
}
