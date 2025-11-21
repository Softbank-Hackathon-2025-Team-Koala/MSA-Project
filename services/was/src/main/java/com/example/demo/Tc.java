package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tc {
    @GetMapping
    public String health() {
        return "-";
    }
    @GetMapping("/was")
    public String hello() {
        return "was server is running";
    }

    
    
}
