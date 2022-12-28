/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo.spring.demo.one;

/**
 *
 * @author MINH TRI
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 2 hour for skill training.";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
