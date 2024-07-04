package com.sqli.gestionDocument.module;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("COLLABORATEUR")
public class Collaborateur extends User {
    private String department;
    @OneToMany(mappedBy = "collaborateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Reservation> reservations = new HashSet<>();
}
