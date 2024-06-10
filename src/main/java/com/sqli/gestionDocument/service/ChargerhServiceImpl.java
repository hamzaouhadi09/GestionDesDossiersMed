package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.module.ChargeRH;
import com.sqli.gestionDocument.module.Collaborateur;
import com.sqli.gestionDocument.repository.ChargerhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChargerhServiceImpl implements ChargerhService{
@Autowired
    private ChargerhRepository chargerhRepository;
    @Override
    public ChargeRH saveChargeRh(ChargeRH chargeRh) {
        return chargerhRepository.save(chargeRh);
    }

    @Override
    public ChargeRH getChargeRhById(Long id) {
        Optional<ChargeRH> chargeRh = chargerhRepository.findById(id);
        return chargeRh.orElseThrow(() -> new RuntimeException("ChargeRH not found with id: " + id));
    }


    @Override
    public List<ChargeRH> getAllChargesRh() {
        return chargerhRepository.findAll();
    }

    @Override
    public ChargeRH updateChargeRh(Long id, ChargeRH chargeRh) {
        ChargeRH existingChargeRh = getChargeRhById(id);
        existingChargeRh.setUsername(chargeRh.getUsername());
        existingChargeRh.setPassword(chargeRh.getPassword());
        existingChargeRh.setOfficeLocation(chargeRh.getOfficeLocation());
        return chargerhRepository.save(existingChargeRh);
    }


    @Override
    public void deleteChargeRh(Long id) {
        chargerhRepository.deleteById(id);
    }
}
