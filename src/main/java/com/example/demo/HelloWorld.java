package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/name")
    public String name() {
        return "Hello Rishabh ";
    }

    @GetMapping("/contact")
    public String number(){
        return "123456789";
    }
}