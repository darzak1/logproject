package pl.edu.wszib.logproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    //Metoda wyświetlająca stronę startową
    @GetMapping("/index")
    public String startPage() {
        return "index";
    }

    //Metoda wyświetlająca stronę update
    @GetMapping("/logupdate")
    public String updatePage() {
        return "logupdate";
    }



    //Metoda usuwająca wpis
    @GetMapping("delete/{id}")
    public String deleteLog(@PathVariable("id") long id, Model model) {
        Log log = logDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Niewłaściwy wpis: " + id));
        logDao.delete(log);
        model.addAttribute("logs", logDao.findAll());
        return "success";
    }

    // Metoda edytująca wpis

    @PostMapping("update/{id}")
    public String updateLog(@PathVariable("id") long id, @Valid Log log, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            log.setId(id);
            return "logupdate";
        }

        logDao.save(log);
        model.addAttribute("logs", logDao.findAll());
        return "index";
    }

    @GetMapping("update/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Log log = logDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Niewłaściwy wpis: " + id));
        model.addAttribute("log", log);
        return "logupdate";
    }


}
