package com.url.shortner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @GetMapping("/test")
    public String test() {
        return "Auth controller is working";
    }
}
