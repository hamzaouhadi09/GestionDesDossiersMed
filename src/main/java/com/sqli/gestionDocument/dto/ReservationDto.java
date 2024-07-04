package com.sqli.gestionDocument.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
@Getter
@Setter
public class ReservationDto {
    private Long id;
    private String typeDeVisite;
    private Date visitDate;
    private Long collaborateurId;
    private Long medecinId;
    private Long chargeRHId;
}
