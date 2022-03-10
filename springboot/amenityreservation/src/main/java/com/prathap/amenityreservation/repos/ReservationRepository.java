package com.prathap.amenityreservation.repos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.prathap.amenityreservation.model.AmenityType;
import com.prathap.amenityreservation.model.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findReservationsByAmenityType(AmenityType amenityType);

    List<Reservation> findReservationsByReservationDateAndStartTimeBeforeAndEndTimeAfterOrStartTimeBetween
            (LocalDate reservationDate, LocalTime startTime, LocalTime endTime, LocalTime betweenStart, LocalTime betweenEnd);
}
