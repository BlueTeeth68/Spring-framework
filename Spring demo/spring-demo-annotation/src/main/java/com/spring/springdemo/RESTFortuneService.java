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
@Component
public class RESTFortuneService implements FortuneService{

    @Override
    public String getFortuneService() {
       return "You are using REST fortune service"; 
        
    }
    
}
