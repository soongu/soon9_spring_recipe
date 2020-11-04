package kr.co.kokono.recipe.chap03.r3_1.service;

import kr.co.kokono.recipe.chap03.r3_1.domain.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> query(String courtName);
}
