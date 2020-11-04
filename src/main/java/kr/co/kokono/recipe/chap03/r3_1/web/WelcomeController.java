package kr.co.kokono.recipe.chap03.r3_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class WelcomeController {

    @GetMapping("/r3_1/welcome")
    public String welcome(Model model) {
        System.out.println("welcome!");
        Date today = new Date();
        model.addAttribute("today", today);
        return "r3_1/welcome";
    }
}
