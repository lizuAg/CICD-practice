package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello(){
        return "<h1> 😎☘️Hello GDSC!🐹👍<h1/>";
    }
}
