package com.course.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the samee
        boolean result = (theCoach == alphaCoach);

        // print result
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for the theCoach: " + theCoach);
        System.out.println("Memory location for the alphaCoach: " + alphaCoach);

        // close context
        context.close();
    }

}
