package com.sqli.gestionDocument.repository;

import com.sqli.gestionDocument.module.Medecin;
import com.sqli.gestionDocument.module.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medecin,Long> {

}
