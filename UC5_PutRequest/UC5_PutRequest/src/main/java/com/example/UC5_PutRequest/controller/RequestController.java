package com.example.UC5_PutRequest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class RequestController {

    // PUT Request Method to return a personalized hello message
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam(value = "lastName", defaultValue = "Guest") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}

