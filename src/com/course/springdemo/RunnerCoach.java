package com.course.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RunnerCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Let's do easy run today";
    }
}
