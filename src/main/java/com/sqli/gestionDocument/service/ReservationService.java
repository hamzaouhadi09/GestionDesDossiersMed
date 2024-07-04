package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.dto.ReservationDto;
import com.sqli.gestionDocument.module.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    Reservation createReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Optional<Reservation> getReservationById(Long id);
    Reservation updateReservation(Long id, Reservation reservation);
    void deleteReservation(Long id);
}
