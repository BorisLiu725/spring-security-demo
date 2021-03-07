package com.ly.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        return "hello world";
    }


    @PostMapping("/doLogin")
    public void login(String username,String password){
        System.out.println("login handler...");
    }

    @GetMapping("/logout")
    public void logout(){
        System.out.println("logout handler...");
    }
}
