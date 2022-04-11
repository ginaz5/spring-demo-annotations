package com.course.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    // to test fortune.txt can be read and write or not.
    public static void main(String[] args) {
        ArrayList<String> arrWithFile =  new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("fortune.txt")
            );
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println("S -> " + s);
                arrWithFile.add(s);
            }
            System.out.println(arrWithFile);
            //br.close();
        } catch (IOException e) {
            System.out.println("something went wrong");

        }
    }
}
