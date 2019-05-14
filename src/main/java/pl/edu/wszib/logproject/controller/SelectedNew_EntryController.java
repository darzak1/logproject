package pl.edu.wszib.logproject.controller;

import com.microsoft.sqlserver.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.util.DateUtils;
import pl.edu.wszib.logproject.dao.SelectedNew_EntryDao;
import pl.edu.wszib.logproject.domain.SelectedAction;

import java.util.Date;

@Controller
public class SelectedNew_EntryController {

    @Value("${app.header.addEntry}")
    private String title;

    @Autowired
    SelectedNew_EntryDao selectedNewEntryDao;

    @GetMapping({"/add", "/add/{entryDate}"})
    public String selectedNew_Entry(
            @PathVariable(required = false) Date entryDate,  Model model) {

        if (!StringUtils.isEmpty(entryDate.toString())) {
            selectedNewEntryDao.save(new SelectedAction(entryDate, new Date()));
        }


        model.addAttribute("add", entryDate);
        return "add";
    }

}
