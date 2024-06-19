package com.api.crud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "tbl_Cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citaId;

    @Column(name = "fecha_cita")
    private Date fechaCita;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    @JsonBackReference // Añadido para evitar referencia circular
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
}