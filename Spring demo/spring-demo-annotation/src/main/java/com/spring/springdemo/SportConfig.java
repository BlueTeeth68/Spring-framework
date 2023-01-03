/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author MINH TRI
 */
@Configuration
@ComponentScan("com.spring")
//if we just want to define beans in the class SportConfig
//we don't need @ComponentScan
public class SportConfig {

    //Define bean for sad fortune service
    @Bean
    //by default, scope of bean is singleton
    //this function is just execute only one time and bean that created is registered to application context
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for soccer coach and inject dependency
    @Bean
    public Coach soccerCoach() {
        return new SoccerCoach(sadFortuneService());
    }
}
