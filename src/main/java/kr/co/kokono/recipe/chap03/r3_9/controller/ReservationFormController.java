package kr.co.kokono.recipe.chap03.r3_9.controller;

import kr.co.kokono.recipe.chap03.r3_9.domain.Player;
import kr.co.kokono.recipe.chap03.r3_9.domain.Reservation;
import kr.co.kokono.recipe.chap03.r3_9.domain.ReservationValidator;
import kr.co.kokono.recipe.chap03.r3_9.domain.SportType;
import kr.co.kokono.recipe.chap03.r3_9.service.ReservationServiceR3_9;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;

@Controller
@RequestMapping("/r3_9/reservationForm")
@SessionAttributes("reservation")
@RequiredArgsConstructor
public class ReservationFormController {

    private final ReservationServiceR3_9 reservationServiceR39;
    private final ReservationValidator reservationValidator;

    //모든 핸들러 메서드가 반환하는 뷰에서 공통적으로 쓸 수 있는 전역 모델 속성 정의
    @ModelAttribute("sportTypes")
    public List<SportType> populateSportTypes() {
        return reservationServiceR39.getAllSportTypes();
    }

    @GetMapping
    public String setupForm(
            @RequestParam(required = false, value = "username") String username,
            Model model) {

        Reservation reservation = new Reservation();
        reservation.setPlayer(new Player(username, null));
        model.addAttribute("reservation", reservation);

        return "r3_9/reservationForm";
    }

    @PostMapping
    public String submitForm(
            @ModelAttribute("reservation") @Validated Reservation reservation,
            BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "r3_9/reservationForm";
        } else {
            reservationServiceR39.make(reservation);
            status.setComplete();
            return "r3_9/reservationSuccess";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(reservationValidator);
    }

}
