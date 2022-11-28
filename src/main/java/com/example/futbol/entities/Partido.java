package com.example.futbol.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="partido")
@Data
public class Partido {

    @Id
    @SequenceGenerator(name="partido_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="partido_id_seq")
    private Integer id;

    private LocalDateTime fecha;

    @OneToOne(mappedBy = "partido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Resultado resultado;

    @OneToOne(mappedBy = "partido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Estadio estadio;
}


