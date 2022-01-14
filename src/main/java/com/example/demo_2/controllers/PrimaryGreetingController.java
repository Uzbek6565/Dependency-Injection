package com.example.demo_2.controllers;

import com.example.demo_2.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryGreetingController {
    GreetingService greetingService;

    public PrimaryGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
