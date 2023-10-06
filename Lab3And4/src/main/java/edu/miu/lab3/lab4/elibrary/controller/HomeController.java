package edu.miu.lab3.lab4.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String displayHomePage(){
        return "index";
    }
}