package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.module.Collaborateur;

import java.util.List;

public interface CollaborateurService {
    Collaborateur saveCollaborateur(Collaborateur collaborateur);
    Collaborateur getCollaborateurById(Long id);
    List<Collaborateur> getAllCollaborateurs();
    Collaborateur updateCollaborateur(Long id, Collaborateur collaborateur);
    void deleteCollaborateur(Long id);
}
