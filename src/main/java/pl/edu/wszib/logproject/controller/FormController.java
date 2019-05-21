package pl.edu.wszib.logproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.logproject.dao.FormDao;
import pl.edu.wszib.logproject.domain.Form;

@Controller
@RequestMapping("/form")
public class FormController {

    @Value("Form")
    private String title;

    @Autowired
    FormDao formDao;

    @GetMapping("/form")
    public String dataPage(Model model) {
        Iterable<Form> forms = formDao.findAll();

        model.addAttribute("title", title);
        model.addAttribute("forms", forms);
        return "form";
    }
}


