package ru.levelp;

/**
 * Created by Nataly on 02.03.2016.
 */

public class Student {
    String name;
    int age;
    boolean isFullTime;
    double avr;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isFullTime == true) System.out.println("Fulltime: yes");
        else if (isFullTime == false) System.out.println("Fulltime: no");
        System.out.println("Average score: "+ avr);
    }
}
