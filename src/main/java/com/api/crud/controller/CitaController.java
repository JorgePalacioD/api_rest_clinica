package com.api.crud.controller;

import com.api.crud.entity.Cita;
import com.api.crud.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/citas") // Define base path for appointment endpoints
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Cita> getAllCitas() {
        return citaService.getAllCitas();
    }

    @GetMapping("/{citaId}")
    public ResponseEntity<Cita> getCitaById(@PathVariable Integer citaId) {
        Optional<Cita> optionalCita = citaService.getCitaById(citaId);

        if (optionalCita.isPresent()) {
            Cita cita = optionalCita.get(); // Assuming cita is present
            return new ResponseEntity<>(cita, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Cita saveOrUpdateCita(@RequestBody Cita cita) {
        return citaService.saveOrUpdateCita(cita);
    }


    @DeleteMapping("/{citaId}")
    public void deleteCita(@PathVariable Integer citaId) {
        citaService.deleteCita(citaId);
    }
}
