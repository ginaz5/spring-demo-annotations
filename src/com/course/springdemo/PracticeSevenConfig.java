package com.course.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSevenConfig {

    @Bean
    public FortuneService PracticeSevenService(){
        return new PracticeSevenService();
    }

    @Bean
    public Coach PracticeSevenCoach() {
        return new PracticeSevenCoach(PracticeSevenService());
    }
}
