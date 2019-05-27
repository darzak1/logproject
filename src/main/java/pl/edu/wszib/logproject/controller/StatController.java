package pl.edu.wszib.logproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.logproject.dao.LogDao;
import pl.edu.wszib.logproject.domain.Log;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class StatController {


    @Autowired
    LogDao logDao;

    @GetMapping("/stat")
    public String statPage(Model model) {

        Iterable<Log> logs = logDao.findAll();
        Collection<Log> logCollection = (Collection<Log>) logs;


        Map<String, Long> dataMap = logCollection.stream()
                .collect(Collectors.groupingBy(Log::getAdmin, Collectors.counting()));

        List<String> labels = (List<String>) dataMap;

        model.addAttribute("dataMap", dataMap);
        model.addAttribute("labels", labels);
        return "stat";

    }


}
