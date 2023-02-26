/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author MINH TRI
 */
@Component
public class RandomFortuneService implements FortuneService {

    //create array of fortune
    private String[] data = {
        "Random fortune 1",
        "Random fortune 2",
        "Random fortune 3",
        "Random fortune 4"
    };

    //Create random number generator
    private Random myRandomTool = new Random();

    @Override
    public String getFortuneService() {
        int index = myRandomTool.nextInt(data.length);
        String myFortune = "You are using random fortune service.\n"
                + "Your fortune is: " + data[index];

        return myFortune;
    }

}
