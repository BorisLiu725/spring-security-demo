package com.ly.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @GetMapping("/login.html")
    public String loginPage(){
        return "/login.html";
    }

//    @RequestMapping("/home.html")
//    public String home(){
//        return "/home.html";
//    }
//
//    @GetMapping("/")
//    public String basePage(){
//        return "/home.html";
//    }
//
//    @GetMapping("/error.html")
//    public String error(){
//        return "/error.html";
//    }
}

