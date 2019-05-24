package pl.edu.wszib.logproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.logproject.domain.Form;

@Controller

public class FormController {


    @GetMapping("/form")
    public String formPage(Model model) {

        model.addAttribute("form", new Form());
        return "form";
    }
}


