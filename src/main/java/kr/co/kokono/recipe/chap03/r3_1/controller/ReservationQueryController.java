package kr.co.kokono.recipe.chap03.r3_1.controller;

import kr.co.kokono.recipe.chap03.r3_1.domain.Reservation;
import kr.co.kokono.recipe.chap03.r3_1.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/r3_1/reservationQuery")
@RequiredArgsConstructor
public class ReservationQueryController {

    private final ReservationService reservationService;

    @GetMapping
    public void setUpForm() {

    }

    @PostMapping
    public String submitForm(@RequestParam("courtName") String courtName, Model model) {
        List<Reservation> reservations = Collections.emptyList();

        if (courtName != null) {
            reservations = reservationService.query(courtName);
        }
        model.addAttribute("reservations", reservations);
        return "r3_1/reservationQuery";
    }
}
