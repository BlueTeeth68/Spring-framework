/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 * @author MINH TRI
 */
@Component
@PropertySource("classpath:coach.properties")
public class SwimCoach implements Coach {

    @Value("${swim.coachName}")
    private String name;
    @Value("${swim.coachEmail}")
    private String email;

    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

    public SwimCoach() {
    }

    public SwimCoach(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getDailyWorkout() {
        return "You are free today.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }

}
