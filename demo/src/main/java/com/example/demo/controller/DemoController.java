package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        return "집에가자.....";
    }

    @GetMapping("/msg/{msg}")
    public String getMessage(@PathVariable String msg) {
        return "Your message is " + msg;
    }
}
