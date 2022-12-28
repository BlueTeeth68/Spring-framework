/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MINH TRI
 */
public class DemoSetterInjection {

    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //retrieve bean from spring container
        CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call method on the bean
        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        System.out.println("Email address: " + myCoach.getEmail());

        System.out.println("Team: " + myCoach.getTeam());
        //close the context
        context.close();
    }
}
