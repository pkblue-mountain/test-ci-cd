package com.example.spring_boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot app is running on EC2";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }
}