package com.example.demo_2;

import com.example.demo_2.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);

        System.out.println("-----Constructor");
        ConstructorGreetingController constructorGreetingController = (ConstructorGreetingController) ctx.getBean("constructorGreetingController");
        System.out.println(constructorGreetingController.sayHello());

        System.out.println("\n-----Primary");
        PrimaryGreetingController primaryGreetingController = (PrimaryGreetingController) ctx.getBean("primaryGreetingController");
        System.out.println(primaryGreetingController.sayHello());

        System.out.println("\n-----Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayHello());

        System.out.println("\n-----Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

    }
}
