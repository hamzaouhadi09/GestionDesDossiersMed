package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.module.Medecin;
import com.sqli.gestionDocument.repository.MedcinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedcinServiceImpl implements MedcinService {
    @Autowired
   private  MedcinRepository medcinRepository;
    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medcinRepository.save(medecin);
    }

    @Override
    public Medecin getMedecinById(Long id) {
        Optional<Medecin> medecin = medcinRepository.findById(id);
        return medecin.orElseThrow(() -> new RuntimeException("Medecin not found with id: " + id));
    }

    @Override
    public List<Medecin> getAllMedecins() {
        return medcinRepository.findAll();
    }
@Override
    public Medecin updateMedecin(Long id, Medecin medecin) {
        Medecin existingMedecin = getMedecinById(id);
        existingMedecin.setUsername(medecin.getUsername());
        existingMedecin.setPassword(medecin.getPassword());
        existingMedecin.setSpecialty(medecin.getSpecialty());
        return medcinRepository.save(existingMedecin);
    }


    @Override
    public void deleteMedecin(Long id) {
        medcinRepository.deleteById(id);
    }
}
