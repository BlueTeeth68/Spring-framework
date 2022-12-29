/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo;

import org.springframework.stereotype.Component;

/**
 *
 * @author MINH TRI
 */

//@Component("sillyCoach")
//instead of define tag <bean> in xml, we use annotation @Component("bean id")

@Component
//The default bean id is the name of class write in camelCase
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }
    
}
