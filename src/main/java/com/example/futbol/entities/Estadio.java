package com.example.futbol.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serial;

public class Estadio {

    @Id
    @SequenceGenerator(name="estadio_id_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="estadio_id_seq")
    private Serial id;
    private String nombre;
    private Integer capacidad;
}
