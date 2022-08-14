package com.project.estore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping(path = "/users/{userId}/album/{albumId}")
    public ModelAndView getAlbum(@PathVariable("userId") String userId, @PathVariable("albumId") String albumId) {
        ModelAndView modelAndView = new ModelAndView("album");
        modelAndView
                .addObject("userId", userId)
                .addObject("albumId", albumId);
        return modelAndView;
    }

    @GetMapping(path = "/users")
    public ModelAndView getUsers(@RequestParam(name = "limit", defaultValue = "30") int limit) {
        System.out.println("Limit is : " + limit);
        ModelAndView modelAndView = new ModelAndView("users");
        return modelAndView;
    }
}
