package com.example.futbol.entities;

import lombok.Data;


import javax.persistence.*;
import java.io.Serial;


@Entity
@Table(name="resultado")
@Data
public class Resultado {
    @Id
    @SequenceGenerator(name="resultado_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="resultado_id_seq")
    private Serial id;

    private Integer goles;

    private Integer amarillas;

    private Integer rojas;

    @JoinColumn(name = "partido_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Partido partido;
}


