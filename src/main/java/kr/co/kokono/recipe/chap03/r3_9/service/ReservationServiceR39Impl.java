package kr.co.kokono.recipe.chap03.r3_9.service;

import kr.co.kokono.recipe.chap03.r3_9.domain.PeriodicReservation;
import kr.co.kokono.recipe.chap03.r3_9.domain.Player;
import kr.co.kokono.recipe.chap03.r3_9.domain.Reservation;
import kr.co.kokono.recipe.chap03.r3_9.domain.SportType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
class ReservationServiceR39Impl implements ReservationServiceR3_9 {

    private static final SportType TENNIS = new SportType(1, "Tennis");
    private static final SportType SOCCER = new SportType(2, "Soccer");
    private static final SportType BASEBALL = new SportType(3, "Base ball");

    private final List<Reservation> reservations = new ArrayList<>();

    public ReservationServiceR39Impl() {

        reservations.add(new Reservation("Tennis #1", LocalDate.of(2020, 1, 14), 16,
                new Player("Roger", "N/A"), TENNIS));
        reservations.add(new Reservation("Tennis #2", LocalDate.of(2020, 1, 14), 20,
                new Player("James", "N/A"), TENNIS));
    }

    @Override
    public List<Reservation> query(String courtName) {

        return this.reservations.stream()
                .filter(reservation -> Objects.equals(reservation.getCourtName(), courtName))
                .collect(Collectors.toList());
    }

    @Override
    public void make(Reservation reservation) throws ReservationNotAvailableException {

        long cnt = reservations.stream()
                .filter(made -> Objects.equals(made.getCourtName(), reservation.getCourtName()))
                .filter(made -> Objects.equals(made.getDate(), reservation.getDate()))
                .filter(made -> made.getHour() == reservation.getHour())
                .count();

        if (cnt > 0) {
            throw new ReservationNotAvailableException(reservation
                    .getCourtName(), reservation.getDate(), reservation
                    .getHour());
        } else {
            reservations.add(reservation);
        }
    }

    @Override
    public List<SportType> getAllSportTypes() {
        return Arrays.asList(TENNIS, SOCCER, BASEBALL);
    }

    @Override
    public SportType getSportType(int sportTypeId) {
        switch (sportTypeId) {
            case 1:
                return TENNIS;
            case 2:
                return SOCCER;
            case 3:
                return BASEBALL;
            default:
                return null;
        }
    }

    @Override
    public List<Reservation> findByDate(LocalDate summaryDate) {
        return reservations.stream().filter(r -> Objects.equals(r.getDate(), summaryDate)).collect(Collectors.toList());
    }

    @Override
    public void makePeriodic(PeriodicReservation periodicReservation)
            throws ReservationNotAvailableException {

        LocalDate fromDate = periodicReservation.getFromDate();

        while (fromDate.isBefore(periodicReservation.getToDate())) {
            Reservation reservation = new Reservation();
            reservation.setCourtName(periodicReservation.getCourtName());
            reservation.setDate(fromDate);
            reservation.setHour(periodicReservation.getHour());
            reservation.setPlayer(periodicReservation.getPlayer());
            make(reservation);

            fromDate = fromDate.plusDays(periodicReservation.getPeriod());

        }
    }

}
