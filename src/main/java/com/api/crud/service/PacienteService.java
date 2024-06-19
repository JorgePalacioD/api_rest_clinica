package com.api.crud.service;

import com.api.crud.entity.Paciente;
import com.api.crud.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> getPacientes(){

        return pacienteRepository.findAll();

    }

    public Optional<Paciente> getPaciente(Integer id){

        return pacienteRepository.findById(id);

    }

    public void saveOrUpdate(Paciente paciente){
        pacienteRepository.save(paciente);

    }

    public void delete(Integer id){
        pacienteRepository.deleteById(id);

    }



}
