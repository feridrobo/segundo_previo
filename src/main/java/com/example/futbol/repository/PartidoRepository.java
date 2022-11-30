package com.example.futbol.repository;

import com.example.futbol.entities.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidoRepository  extends JpaRepository<Partido, Integer> {
}
