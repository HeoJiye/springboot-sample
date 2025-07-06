package com.example.springboot_sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class SampleController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
            "status", "healthy",
            "application", "springboot-sample",
            "timestamp", LocalDateTime.now().toString(),
            "message", "Application is running successfully"
        );
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
} 