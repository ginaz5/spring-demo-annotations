package com.course.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // an array of strings
    private String[] data = {
            "The Cat in the Hat",
            "Diligence is the mother of luck",
            "The journey is the reward"
    };

    // random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
