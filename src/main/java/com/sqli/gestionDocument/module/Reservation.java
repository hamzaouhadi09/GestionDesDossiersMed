package com.sqli.gestionDocument.module;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String typeDeVisite;

        @Temporal(TemporalType.TIMESTAMP)
        private Date visitDate;

        @ManyToOne
        @JoinColumn(name = "collaborateur_id")
        private Collaborateur collaborateur;

        @ManyToOne
        @JoinColumn(name = "chargerh_id")
        private ChargeRH chargeRH;

        @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private VisiteMedicale visiteMedicale;
}
