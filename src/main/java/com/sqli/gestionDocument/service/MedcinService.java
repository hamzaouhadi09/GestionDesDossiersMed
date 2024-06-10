package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.module.Medecin;

import java.util.List;

public interface MedcinService {
    Medecin saveMedecin(Medecin medecin);
    Medecin getMedecinById(Long id);
    List<Medecin> getAllMedecins();
    Medecin updateMedecin(Long id, Medecin medecin);
    void deleteMedecin(Long id);
}
