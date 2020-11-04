package kr.co.kokono.recipe.chap03.r3_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class WelcomeControllerR3_3 {

    @GetMapping("/r3_3/welcome")
    public String welcome(Model model) {
        Date today = new Date();
        model.addAttribute("today", today);

        return "r3_3/welcome";
    }
}
