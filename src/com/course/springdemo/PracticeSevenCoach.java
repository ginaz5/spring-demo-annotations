package com.course.springdemo;

public class PracticeSevenCoach implements Coach {

    private FortuneService fortuneService;

    public PracticeSevenCoach(FortuneService thefortuneService) {
        fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Seven!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
