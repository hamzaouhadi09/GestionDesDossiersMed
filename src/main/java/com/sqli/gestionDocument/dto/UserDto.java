package com.sqli.gestionDocument.dto;

import lombok.*;

import java.util.Date;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Date DateNaissance;
    private String role;
    private String Speciality;
    private String Departement;
    private String officeLocation;

}
