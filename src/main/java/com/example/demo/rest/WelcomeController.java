package com.example.demo.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String getWelcomeMessage(){
        return "Welcome to this Welcome Message endpoint";
    }

    @DeleteMapping("/welcome")
    public String goodbyeWorld(){
        return "Goodbye Cruel World " + LocalDateTime.now();
    }

}
