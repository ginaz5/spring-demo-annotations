package com.course.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach Practice = context.getBean("runnerCoach", Coach.class);
        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

        // call the method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(Practice.getDailyWorkout());

        // call the method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call injected properties values
        System.out.println("Team: "+ tennisCoach.getTeam());
        System.out.println("Email: "+ tennisCoach.getEmail());

        // close the context
        context.close();

    }

}
