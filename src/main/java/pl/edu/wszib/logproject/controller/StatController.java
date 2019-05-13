package pl.edu.wszib.logproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.logproject.dao.SelectedColorDao;
import pl.edu.wszib.logproject.domain.SelectedAction;
import pl.edu.wszib.logproject.helper.ColorHelper;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class StatController {

    @Value("${app.header.stat}")
    private String title;

    @Autowired
    SelectedColorDao selectedColorDao;

    @GetMapping("/stat")
    public String statPage(Model model) {

        Iterable<SelectedAction> selectedColors = selectedColorDao.findAll();
        Collection<SelectedAction> selectedActionCollection =
                (Collection<SelectedAction>) selectedColors;

        //grupowanie
        Map<String, Long> dataMap = selectedActionCollection.stream()
            .collect(Collectors.groupingBy(SelectedAction::getSearch, Collectors.counting()));

        List<String> labels = ColorHelper.convertColors(dataMap.keySet());


        model.addAttribute("title", title);
        model.addAttribute("dataMap", dataMap);
        model.addAttribute("labels", labels);
        return "stat";
    }

}

