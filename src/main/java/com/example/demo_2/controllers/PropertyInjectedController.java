package com.example.demo_2.controllers;

import com.example.demo_2.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedService")
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
