package com.example.demo_2.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello world! ---- Setter Injected";
    }
}
