package pl.edu.wszib.logproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.logproject.domain.Log;

@Controller
public class LogController {

    //Metoda wyświetlająca formularz (GET)
    @GetMapping("/log")
    public String showLogForm(Model model) {
        model.addAttribute("log",new Log());
        return "log";
    }
}
