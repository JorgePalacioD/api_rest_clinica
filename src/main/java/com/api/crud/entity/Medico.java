package com.api.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_Medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medicoId;

    private String name;
    private String lastName;
    private String especialidad; // Doctor's specialty
}