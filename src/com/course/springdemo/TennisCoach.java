package com.course.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // the default bean id will be tennisCoach
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: default constructor");
    }

    /* define a setter method
    @Autowired
    public void anyMethodName(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside of anyMethodName");
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired // inject constructor
    public TennisCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
