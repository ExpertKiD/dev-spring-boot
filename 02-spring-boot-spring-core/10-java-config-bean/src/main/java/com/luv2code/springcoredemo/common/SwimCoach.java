package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Swim a 1000m as a warm up!";
    }
}
