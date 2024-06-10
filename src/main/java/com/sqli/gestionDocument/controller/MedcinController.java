package com.sqli.gestionDocument.controller;

import com.sqli.gestionDocument.module.Medecin;
import com.sqli.gestionDocument.service.MedcinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/medecin")
public class MedcinController {
    @Autowired
    private MedcinService medcinService;
    @PostMapping
    public ResponseEntity<Medecin> createMedecin(@RequestBody Medecin medecin) {
        return ResponseEntity.ok(medcinService.saveMedecin(medecin));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Medecin> getMedecin(@PathVariable Long id) {
        return ResponseEntity.ok(medcinService.getMedecinById(id));
    }
    @GetMapping
    public ResponseEntity<List<Medecin>> getAllMedecins() {

        return ResponseEntity.ok(medcinService.getAllMedecins());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Medecin> updateMedecin(@PathVariable Long id, @RequestBody Medecin medecin) {
        return ResponseEntity.ok(medcinService.updateMedecin(id, medecin));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedecin(@PathVariable Long id) {
        medcinService.deleteMedecin(id);
        return ResponseEntity.noContent().build();
    }
}
