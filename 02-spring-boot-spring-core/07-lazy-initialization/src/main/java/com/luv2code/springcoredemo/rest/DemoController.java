package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency

    private final Coach myCoach;
    
    // define a constructor for dependency injection
    // Optional if there is only one constructor
    @Autowired
    DemoController(@Qualifier("cricketCoach") Coach coach) {
        myCoach = coach;

        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
