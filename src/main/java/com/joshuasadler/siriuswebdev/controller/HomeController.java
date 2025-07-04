package com.joshuasadler.siriuswebdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Joshua");
        return "home"; // This maps to src/main/resources/templates/home.html
    }
}
