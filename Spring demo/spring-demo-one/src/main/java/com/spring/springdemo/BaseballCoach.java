/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo;

/**
 *
 * @author MINH TRI
 */
public class BaseballCoach implements Coach {

    //define private field for dependency
    private FortuneService fortuneService;

    //define constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 1 hour for doing physical training.";
    }

    @Override
    public String getDailyFortune() {
        
        //use my fortune to get fortune service
        return fortuneService.getFortune();
    }
}
