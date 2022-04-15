package com.course.springdemo;

public class PracticeSevenService implements FortuneService {
    @Override
    public String getFortune() {
        return "This last practice of Spring bean with no xml";
    }
}
