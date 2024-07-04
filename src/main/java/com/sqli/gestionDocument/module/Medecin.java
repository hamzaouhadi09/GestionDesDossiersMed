package com.sqli.gestionDocument.module;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("MEDECIN")
public class Medecin extends User {
        private String specialty;

}
