package com.bridgelabz.AssignmentTwo_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerMVC {

    @GetMapping("/web")
    public String message(){
        return "hello";
    }

    @GetMapping("/web/message")
    public String messgae(Model model){
        model.addAttribute("message","Hello From Bridgelabz");
        return "message";
    }
}
