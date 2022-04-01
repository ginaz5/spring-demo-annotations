package com.course.springdemo;

import org.springframework.stereotype.Component;

@Component // the default bean id will be tennisCoach
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
