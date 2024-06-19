package com.api.crud.controller;

import com.api.crud.entity.Medico;
import com.api.crud.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/medicos") // Define base path for doctor endpoints
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.getAllMedicos();
    }

    @GetMapping("/{medicoId}")
    public Optional<Medico> getMedicoById(@PathVariable Integer medicoId) {
        return medicoService.getMedicoById(medicoId);
    }

    @PostMapping
    public Medico saveOrUpdateMedico(@RequestBody Medico medico) {
        return medicoService.saveOrUpdateMedico(medico);
    }

    @DeleteMapping("/{medicoId}")
    public void deleteMedico(@PathVariable Integer medicoId) {
        medicoService.deleteMedico(medicoId);
    }
}
