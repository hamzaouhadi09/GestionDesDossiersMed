package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.module.ChargeRH;

import java.util.List;

public interface ChargerhService {
    ChargeRH saveChargeRh(ChargeRH chargeRh);
    ChargeRH getChargeRhById(Long id);
    List<ChargeRH> getAllChargesRh();
    ChargeRH updateChargeRh(Long id, ChargeRH chargeRh);
    void deleteChargeRh(Long id);
}
