package com.example.futbol.repository;

import com.example.futbol.entities.Seleccion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SeleccionRepository  extends JpaRepository<Seleccion, Integer> {
}
