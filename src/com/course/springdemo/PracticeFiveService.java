package com.course.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component
@PropertySource("classpath:practiceFive.properties")
public class PracticeFiveService implements FortuneService {

    @Value("${practice.fortunes}")
    private String[] arrWithProperties;
    private ArrayList<String> arrWithFile;

    private Random myRandom = new Random();

    public PracticeFiveService () {


        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/ginalin/Dev/IDEA/spring-demo-annotations/src/fortune.txt")
            );
            String s;
            while ((s = br.readLine()) != null){
                System.out.println("S -> "+s);
                arrWithFile.add(s);
            }
            //br.close();
        } catch (IOException e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
    }


    @Override
    public String getFortune() {
        int index = myRandom.nextInt(arrWithProperties.length);
        return "This is practice Five -> " + arrWithProperties[index];

//        int index = myRandom.nextInt(arrWithFile.size());
//        return "This is practice Five -> " + arrWithFile.get(index);
    }

}