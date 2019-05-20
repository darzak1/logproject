package pl.edu.wszib.logproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.edu.wszib.logproject.dao.SelectedNew_EntryDao;
import pl.edu.wszib.logproject.domain.SelectedAction;

import java.util.Date;

@Controller
public class SelectedNewEntryDateController {

    @Value("Podaj Date")
    private String title;

    @Autowired
    SelectedNew_EntryDao selectedNewEntryDao;

    @GetMapping({"/entryDate"})
    public Date NewEntryDate(
            @PathVariable(required = false) Date entryDate,  Model model) {

        if (entryDate != null) {
            selectedNewEntryDao.save(new SelectedAction(entryDate, new Date()));
        }


        model.addAttribute("entryDate", entryDate);
        return entryDate;
    }

}
