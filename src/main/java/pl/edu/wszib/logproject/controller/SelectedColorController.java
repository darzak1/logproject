package pl.edu.wszib.logproject.controller;

import com.microsoft.sqlserver.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.edu.wszib.logproject.dao.SelectedColorDao;
import pl.edu.wszib.logproject.domain.SelectedAction;

import java.util.Date;

@Controller
public class SelectedColorController {

    @Value("${app.header.select_color}")
    private String title;

    @Autowired
    SelectedColorDao selectedColorDao;

    @GetMapping({"/select","/select/{color}"})
    public String selectColorPage(
            @PathVariable(required = false) String color,  Model model) {

        if (!StringUtils.isEmpty(color)) {
            selectedColorDao.save(new SelectedAction(color, new Date()));
        }

        String[][] colors = {
                {"red", "blue", "purple", "teal"},
                {"black","orange", "yellow", "green"},
                {"gray","silver", "olive", "lime"},
                {"navy","lime", "aqua", "fuchsia"}
        };

        model.addAttribute("title", title);
        model.addAttribute("colors", colors);
        return "select";
    }
}
