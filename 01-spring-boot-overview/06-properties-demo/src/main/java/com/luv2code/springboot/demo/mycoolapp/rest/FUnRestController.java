package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Target;

@RestController
public class FUnRestController {
    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World.";
    }


    /// exposes new endpoint for "team-info"
    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "Coach: "+coachName +", Team: "+teamName;


    }

}
