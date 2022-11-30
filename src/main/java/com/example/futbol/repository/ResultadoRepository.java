package com.example.futbol.repository;

import com.example.futbol.entities.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultadoRepository extends JpaRepository<Resultado, Integer> {
}
