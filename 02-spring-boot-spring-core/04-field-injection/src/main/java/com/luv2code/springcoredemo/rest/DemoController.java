package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency

    /// Field injection using reflection API
    @Autowired
    private Coach myCoach;

    // define a constructor for dependency injection
    // Optional if there is only one constructor
//    @Autowired
//    DemoController(Coach coach) {
//        myCoach = coach;
//    }


    /// Setter injection

//    @Autowired
//    public void setCoach(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }



}