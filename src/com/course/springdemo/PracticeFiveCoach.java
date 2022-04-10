package com.course.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PracticeFiveCoach implements Coach {

    @Autowired
    @Qualifier("practiceFiveService")
    private FortuneService fortuneService;

    // constructor
    public PracticeFiveCoach() {
        System.out.println("PracticeFiveCoach Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "This is practice Five";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
