package com.luv2code.sringcoredemo.rest;

import com.luv2code.sringcoredemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    // Optional if there is only one constructor
    @Autowired
    DemoController(Coach coach) {
        myCoach = coach;
    }



}
