package com.sqli.gestionDocument.intialize;

import com.sqli.gestionDocument.module.Role;
import com.sqli.gestionDocument.module.RoleType;
import com.sqli.gestionDocument.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        if (roleRepository.findAll().isEmpty()) {
            roleRepository.save(new Role(null, RoleType.CHARGE_RH));
            roleRepository.save(new Role(null, RoleType.MEDECIN));
            roleRepository.save(new Role(null, RoleType.COLLABORATEUR));
        }
    }
}
