package kr.co.kokono.recipe.chap03.r3_9.service;


import kr.co.kokono.recipe.chap03.r3_9.domain.PeriodicReservation;
import kr.co.kokono.recipe.chap03.r3_9.domain.Reservation;
import kr.co.kokono.recipe.chap03.r3_9.domain.SportType;

import java.time.LocalDate;
import java.util.List;

public interface ReservationServiceR3_9 {

    List<Reservation> query(String courtName);

    void make(Reservation reservation)
            throws ReservationNotAvailableException;

    List<SportType> getAllSportTypes();

    SportType getSportType(int sportTypeId);

    List<Reservation> findByDate(LocalDate summaryDate);

    void makePeriodic(PeriodicReservation periodicReservation)
            throws ReservationNotAvailableException;
}
