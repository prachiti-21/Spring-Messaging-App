package com.messaging.Messaging.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET Request Method to return a hello message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}

