package com.sqli.gestionDocument.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
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
