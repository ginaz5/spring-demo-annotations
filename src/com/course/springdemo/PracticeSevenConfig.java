package com.course.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSevenConfig {

    @Bean
    public FortuneService practiceSevenService(){
        return new PracticeSevenService();
    }

    @Bean
    public Coach practiceSevenCoach() {
        return new PracticeSevenCoach(practiceSevenService());
    }
}
