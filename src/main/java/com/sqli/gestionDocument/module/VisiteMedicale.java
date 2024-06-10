package com.sqli.gestionDocument.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisiteMedicale {
    private Long visite_id;
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @OneToOne(mappedBy = "visiteMedicale", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private DocumentMedical documentMedical;
}
