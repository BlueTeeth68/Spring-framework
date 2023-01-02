/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author MINH TRI
 */
public class DemoJavaConfig {

    public static void main(String[] args) {

        //read spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call bean method
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
