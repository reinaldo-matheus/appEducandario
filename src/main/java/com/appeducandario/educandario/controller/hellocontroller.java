package com.appeducandario.educandario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
@GetMapping("/api/hello") 
public String hello(){
    return "hello";
}
}


