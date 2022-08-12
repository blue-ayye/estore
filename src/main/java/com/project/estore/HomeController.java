package com.project.estore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView homePage() {

//        With Map
//        Map<String, String> model = new HashMap<>();
//        model.put("firstName", "Sharath");
//        model.put("lastName", "M A");
//
//        ModelAndView modelAndView = new ModelAndView("home", model);

//        Without Map
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("firstName", "sharath");
        modelAndView.addObject("lastName", "m a");
        return modelAndView;
    }
}
