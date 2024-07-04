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
@DiscriminatorValue("CHARGERH")
public class ChargeRH extends User {
    private String officeLocation;
    @OneToMany(mappedBy = "chargeRH", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Reservation> reservations = new HashSet<>();
}
