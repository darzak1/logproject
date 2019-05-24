package pl.edu.wszib.logproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.logproject.domain.Test;

@Controller
public class TestController {

    //Metoda wyświetlająca formularz (GET)
    @GetMapping("/test")
    public String showLogForm(Model model) {
        model.addAttribute("test",new Test());
        return "test";
    }
}

