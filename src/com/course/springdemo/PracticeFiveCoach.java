package com.course.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class PracticeFiveCoach implements Coach {

    @Autowired
    @Qualifier("practiceFiveService")
    private FortuneService fortuneService;

    // constructor
    public PracticeFiveCoach() {
        System.out.println("PracticeFiveCoach Constructor");
    }

    // define my init method
    @PostConstruct
    public void readFile() {
        System.out.println("This is @PostConstruct");
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/ginalin/Dev/IDEA/spring-demo-annotations/src/fortune.txt")
            );
            String s;
            System.out.println("-- File output --");
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
    }

    // define my destroy method
    @PreDestroy
    public void MyDestroy() {
        System.out.println("This is @PreDestroy");
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
