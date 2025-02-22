package com.example.UC3_RestCall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RequestController {

    // GET Request Method to return a personalized hello message using path variable
    @GetMapping("/param/{name}")
    public String sayHelloPathVar(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}

