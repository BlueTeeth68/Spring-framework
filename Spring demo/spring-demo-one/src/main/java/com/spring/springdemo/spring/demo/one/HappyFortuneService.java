/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo.spring.demo.one;

/**
 *
 * @author MINH TRI
 */
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
    
}
