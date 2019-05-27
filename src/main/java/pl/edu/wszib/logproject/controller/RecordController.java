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
