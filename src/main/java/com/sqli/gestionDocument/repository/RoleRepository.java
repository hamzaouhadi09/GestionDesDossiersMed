package com.sqli.gestionDocument.repository;

import com.sqli.gestionDocument.module.Role;
import com.sqli.gestionDocument.module.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(RoleType name);
}
