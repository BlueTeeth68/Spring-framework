/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MINH TRI
 */
public class DemoInjectPropertiesFile {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println("Email: " + coach.getEmail());
        System.out.println("Name: " + coach.getName());

    }
}
