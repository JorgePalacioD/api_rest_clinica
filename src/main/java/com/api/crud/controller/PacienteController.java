package com.api.crud.controller;

import com.api.crud.entity.Paciente;
import com.api.crud.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping(path="api/v1/pacientes")

public class PacienteController {

    @Autowired
   private PacienteService pacienteService;



    @GetMapping
    public List<Paciente> getAll(){

        return pacienteService.getPacientes();

    }

    @GetMapping("/{pacienteId}")
    public Optional<Paciente> getById (@PathVariable("pacienteId") Integer pacienteId){

        return pacienteService.getPaciente(pacienteId);

    }

    @PostMapping
    public Paciente saveUpdate(@RequestBody Paciente paciente){

         pacienteService.saveOrUpdate(paciente);
         return paciente;

    }

    @DeleteMapping("/{pacienteId}")
    public void saveUpdate(@PathVariable("pacienteId") Integer pacienteId){

        pacienteService.delete(pacienteId);

    }



}
