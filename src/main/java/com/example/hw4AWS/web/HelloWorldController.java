package com.example.hw4AWS.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/aws/hello-world")
public class HelloWorldController {

    @GetMapping
    public String greeting() {
        return "Hello world";
    }

}
