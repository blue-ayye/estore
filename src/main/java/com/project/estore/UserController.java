package com.project.estore;

import com.project.estore.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

//    @PostMapping(path = "/users")
//    public String signupFormSubmit(@ModelAttribute User user) {
//        return "signup-result";
//    }

    @PostMapping(path = "/users")
    @ResponseBody
    public ResponseEntity createUser(@RequestBody User user) {

        return new ResponseEntity(
                new User(
                        user.getFirstName(),
                        user.getLastName(),
                        user.getEmail()
                ),
                HttpStatus.OK);
    }

    @GetMapping(path = "/signup")
    public String signupForm() {
        return "signup";
    }
}
