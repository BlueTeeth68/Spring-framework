/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo.spring.demo.one;

/**
 *
 * @author MINH TRI
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket 15 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
