package com.sqli.gestionDocument.repository;

import com.sqli.gestionDocument.module.DocumentMedical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentMedicalRepository extends JpaRepository<DocumentMedical, Long> {
}