package com.sqli.gestionDocument.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reservation {
    @jakarta.persistence.Id
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    private Date Date;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "collaborateur_id")
        private Collaborateur collaborateur;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "medecin_id")
        private Medecin medecin;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "chargeRH_id")
        private ChargeRH chargeRH;

        @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private VisiteMedicale visiteMedicale;


}
