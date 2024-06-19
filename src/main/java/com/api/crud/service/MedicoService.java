package com.api.crud.service;

import com.api.crud.entity.Medico;
import com.api.crud.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> getMedicoById(Integer medicoId) {
        return medicoRepository.findById(medicoId);
    }

    public Medico saveOrUpdateMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public void deleteMedico(Integer medicoId) {
        medicoRepository.deleteById(medicoId);
    }
}
