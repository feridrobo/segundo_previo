package com.example.futbol.entities;


import java.io.Serial;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="seleccion")
@Data
public class Seleccion {

    @Id
    @SequenceGenerator(name="seleccion_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seleccion_id_seq")
    private Serial id;

    private String nombre;

    private String grupo;

    @ManyToOne
    @JoinColumn(name="continente_id")
    private Continente continente;

}

