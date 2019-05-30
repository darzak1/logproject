package pl.edu.wszib.logproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.logproject.domain.Log;
import pl.edu.wszib.logproject.services.LogService;

import java.util.List;

@Controller
public class RecordController {

    @Autowired
    LogService logService;

    @RequestMapping("/records")
    public String allRecords (Model model){

        List<Log> logs = logService.getPublishedLogs();
        model.addAttribute("logs", logs);
        //return "logs/alllogs"; nie ma takiego pliku html logs/alllogs
        return "records"; // ale jest records.html

    }

}

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.logproject.dao.RecordDao;
import pl.edu.wszib.logproject.domain.Log;

import javax.validation.Valid;

@Controller
@RequestMapping("/logs/")
public class RecordController {

    private final RecordDao recordDao;

    @Autowired
    public RecordController(RecordDao recordDao) {
        this.recordDao = recordDao;
    }

    @GetMapping("log")
    public String showSignUpForm(Log log) {
        return "dodaj-wpis";
    }

    @GetMapping("list")
    public String showUpdateForm(Model model) {
        model.addAttribute("logs", recordDao.findById());
        return "index";
    }

    @PostMapping("add")
    public String addLog(@Valid Log log, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-student";
        }

        recordDao.save(log);
        return "redirect:list";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Log student = recordDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Niewłaściwe Id wpisu: " + id));
        model.addAttribute("student", student);
        return "update-log";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") long id, @Valid Log log, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            log.setId(id);
            return "update-student";
        }

        recordDao.save(log);
        model.addAttribute("students", recordDao.findAll());
        return "index";
    }

    @GetMapping("delete/{id}")
    public String deleteLog(@PathVariable("id") long id, Model model) {
        Log log = recordDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Niewłaściwe Id wpisu: " + id));
        recordDao.delete(log);
        model.addAttribute("students", recordDao.findAll());
        return "index";
    }
}*/
