package com.example.futbol.entities;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="continente")
@Data
public class Continente {

    @Id
    @SequenceGenerator(name="continente_id_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="continente_id_seq")
    private Serial id;
    private String nombre;


    @OneToMany (mappedBy="continente")
    private List<Seleccion> selecciones;
}
