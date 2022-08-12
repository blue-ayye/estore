package com.project.estore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(ModelMap model) {
        model.addAttribute("firstName", "Sharath")
                .addAttribute("lastName", "M A");
        return "home";
    }
}
