package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    /// by default the function name is taken as qualifier name
    /// you can override it as below
    @Bean("aquatic")
    public SwimCoach swimCoach(){
        return new SwimCoach();
    }
}
