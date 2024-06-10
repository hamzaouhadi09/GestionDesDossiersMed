package com.sqli.gestionDocument.controller;

import com.sqli.gestionDocument.module.ChargeRH;
import com.sqli.gestionDocument.service.ChargerhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/ChargeRh")
public class ChargerhController {
    @Autowired
    private ChargerhService chargerhService;

    @GetMapping
    public ResponseEntity<List<ChargeRH>> getAllChargesRh() {
        return ResponseEntity.ok(chargerhService.getAllChargesRh());
    }

    @PostMapping
    public ResponseEntity<ChargeRH> createChargeRh(@RequestBody ChargeRH chargeRh) {
        return ResponseEntity.ok(chargerhService.saveChargeRh(chargeRh));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChargeRH> getChargeRh(@PathVariable Long id) {
        return ResponseEntity.ok(chargerhService.getChargeRhById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ChargeRH> updateChargeRh(@PathVariable Long id, @RequestBody ChargeRH chargeRh) {
        return ResponseEntity.ok(chargerhService.updateChargeRh(id, chargeRh));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChargeRh(@PathVariable Long id) {
        chargerhService.deleteChargeRh(id);
        return ResponseEntity.noContent().build();
    }
}
