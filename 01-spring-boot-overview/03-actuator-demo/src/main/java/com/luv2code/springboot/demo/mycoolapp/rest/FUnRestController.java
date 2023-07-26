package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Target;

@RestController
public class FUnRestController {
    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World5";
    }


}
