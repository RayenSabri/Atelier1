package tn.esprit.autoloc.web.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
public class VehiculeController {
    private final VehiculeRepository vehiculeRepository;

    public VehiculeController(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping
    public List<Vehicule> getAll() {
        return vehiculeRepository.findAll();
    }

    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return vehiculeRepository.save(v);
    }
}
