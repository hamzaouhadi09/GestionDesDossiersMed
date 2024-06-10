package com.sqli.gestionDocument.service;

import com.sqli.gestionDocument.module.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    public Reservation createReservation(Reservation reservation);
    public List<Reservation> getAllReservations();
    public Optional<Reservation> getReservationById(Long id);
    public Reservation updateReservation(Long id, Reservation reservationDetails);
    public void deleteReservation(Long id);
}
