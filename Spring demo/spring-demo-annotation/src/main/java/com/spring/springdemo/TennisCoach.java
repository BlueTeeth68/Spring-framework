/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author MINH TRI
 */
//@Component("sillyCoach")
//instead of define tag <bean> in xml, we use annotation @Component("bean id")
@Component
//The default bean id is the name of class write in camelCase
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //In spring 4.3 or later, we don't need @Autowired annotation to inject dependency to constructor
    //that have only 1 constructor using the target bean
    //But if there are many constructor that uses the bean
    //we must have @Autowired to define which constructor is using the bean

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }

//    @Autowired
//    @Qualifier("randomFortuneService")
//    public FortuneService getFortuneService() {
//        return fortuneService;
//    }
}
