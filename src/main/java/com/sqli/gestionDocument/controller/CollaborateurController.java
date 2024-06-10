package com.sqli.gestionDocument.controller;

import com.sqli.gestionDocument.module.Collaborateur;
import com.sqli.gestionDocument.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/collaborateurs")
public class CollaborateurController {
    @Autowired
    private CollaborateurService collaborateurService;
    @GetMapping
    public  ResponseEntity<List<Collaborateur>> getAllCollaborateurs() {
        return ResponseEntity.ok(collaborateurService.getAllCollaborateurs());
    }
    @PostMapping
        public ResponseEntity<Collaborateur> createCollaborateur(@RequestBody Collaborateur collaborateur) {
        return ResponseEntity.ok(collaborateurService.saveCollaborateur(collaborateur));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Collaborateur> getCollaborateur(@PathVariable Long id) {
        return ResponseEntity.ok(collaborateurService.getCollaborateurById(id));
    }


}
