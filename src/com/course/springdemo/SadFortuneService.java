package com.course.springdemo;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This is a sad day ";
    }
}
