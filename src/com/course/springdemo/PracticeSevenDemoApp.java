package com.course.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeSevenDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PracticeSevenConfig.class);

        // get the bean from spring container
        // change type to SwimCoach to use getEmail and getTeam method that not in Coach.class
        PracticeSevenCoach theCoach = context.getBean("practiceSevenCoach", PracticeSevenCoach.class);

        // call the method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());


        // close the context
        context.close();

    }

}
