package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tc {
    @GetMapping
    public String health() {
        return "-";
    }
    @GetMapping("/waaaas")
    public String hello() {
        return "waaaas server is running";
    }
}
