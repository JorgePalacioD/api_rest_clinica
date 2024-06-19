package com.api.crud.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tbl_Paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pacienteId;

    private String nombre;
    private String apellido;
    private String email;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference // Añadido para evitar referencia circular
    private List<Cita> citas;

    public Paciente() {
    }

    // Constructor con parámetros
    public Paciente(Integer pacienteId, String nombre, String apellido, String email, List<Cita> citas) {
        this.pacienteId = pacienteId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.citas = citas;
    }
}