package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.module.Collaborateur;
import com.sqli.gestionDocument.repository.CollaborateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CollaborateurServiceImpl implements CollaborateurService {
    @Autowired
     private  CollaborateurRepository collaborateurRepository;
    @Override
    public Collaborateur saveCollaborateur(Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }

    @Override
    public Collaborateur getCollaborateurById(Long id) {
        Optional<Collaborateur> collaborateur = collaborateurRepository.findById(id);
        return collaborateur.orElseThrow(() -> new RuntimeException("Collaborateur not found with id: " + id));
    }

    @Override
    public List<Collaborateur> getAllCollaborateurs() {
        return collaborateurRepository.findAll();
    }

    @Override
    public Collaborateur updateCollaborateur(Long id, Collaborateur collaborateur) {
        Collaborateur existingCollaborateur = getCollaborateurById(id);
        existingCollaborateur.setUsername(collaborateur.getUsername());
        existingCollaborateur.setPassword(collaborateur.getPassword());
        existingCollaborateur.setDepartment(collaborateur.getDepartment());
        return collaborateurRepository.save(existingCollaborateur);
    }

    @Override
    public void deleteCollaborateur(Long id) {
        collaborateurRepository.deleteById(id);
    }
}
