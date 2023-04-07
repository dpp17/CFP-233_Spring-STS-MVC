package com.bridgelabz.AssignmentTwo_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerMVC {

    @GetMapping("/web")
    public String message(){
        return "hello";
    }
}
