package com.api.crud.service;

import com.api.crud.entity.Cita;
import com.api.crud.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> getAllCitas() {
        return citaRepository.findAll();
    }

    public Optional<Cita> getCitaById(Integer citaId) {
        return citaRepository.findById(citaId);
    }

    public Cita saveOrUpdateCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public void deleteCita(Integer citaId) {
        citaRepository.deleteById(citaId);
    }
}
