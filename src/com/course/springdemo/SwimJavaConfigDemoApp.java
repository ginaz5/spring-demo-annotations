package com.course.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        // change type to SwimCoach to use getEmail and getTeam method that not in Coach.class
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call the method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // call inject properties
        System.out.println("Injected Email: " + theCoach.getEmail());
        System.out.println("Injected Team: " + theCoach.getTeam());


        // close the context
        context.close();

    }

}
