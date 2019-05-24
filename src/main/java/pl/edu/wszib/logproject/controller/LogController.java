package pl.edu.wszib.logproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.logproject.dao.LogDao;
import pl.edu.wszib.logproject.domain.Log;

import javax.validation.Valid;

@Controller
public class LogController {

    @Autowired
    LogDao logDao;

    //Metoda wyświetlająca formularz (GET)
    @GetMapping("/log")
    public String showLogForm(Model model) {
        model.addAttribute("log",new Log());
        return "log";
    }

    //Metoda zapisująca formularz (POST)
    @PostMapping("/log")
    public String saveLogForm(@Valid Log log, BindingResult bindingResult) {

        if (!bindingResult.hasErrors()) {
            logDao.save(log);
            return "success";
        }

        return "log";
    }


}
