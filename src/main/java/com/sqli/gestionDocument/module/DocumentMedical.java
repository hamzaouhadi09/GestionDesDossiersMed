package com.sqli.gestionDocument.module;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visiteMedicale_id")
    private VisiteMedicale visiteMedicale;

}
