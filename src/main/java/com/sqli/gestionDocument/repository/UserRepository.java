package com.sqli.gestionDocument.repository;

import com.sqli.gestionDocument.module.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
