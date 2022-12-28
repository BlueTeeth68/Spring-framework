/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.spring.springdemo.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MINH TRI
 */
//Example about Inversion of control (IoC) in Spring 
public class MyApp {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        //create object
        //we can create any type of coach here because of the interface
        //but it is still hard code and we need to change code when the coach is change
//        Coach myCoach = new TrackCoach();
//
//        System.out.println(myCoach.getDailyWorkout());
//
//        System.out.println("==============================================");

        //load spring config file
        //create spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //retrieve bean from container
        Coach mySubCoach = context.getBean("myCoach", Coach.class);
        //Coach.class is the interface that myCoach implement

        System.out.println(mySubCoach.getDailyWorkout());
        System.out.println(mySubCoach.getDailyFortune());
        
        //close the context
        context.close();
        

    }
}
