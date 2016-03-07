package ru.levelp;

/**
 * Created by Nataly on 02.03.2016.
 */

public class Student {

    // (!) при создании класса все поля в нем делать сразу PRIVATE

    public static final int FROM_RUS = 0; // публичные константы
    public static final int FROM_KAZ = 1;
    public static final int FROM_BEL = 2;

    private String name;
    private int age;
    private boolean isFullTime;
    private double avr;
    private int from; // 0 - рф / 1 - казахстан / 2- белоруссия

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isFullTime == true) System.out.println("Fulltime: yes");
        else if (isFullTime == false) System.out.println("Fulltime: no");
        System.out.println("Average score: "+ avr);
        if (from == 0) System.out.println("Country: Russia");
        else if (from == 1) System.out.println("Country: Kazakhstan");
        else if (from == 2) System.out.println("Country: Belorussia");
    }

    // get возвращает значение
    // set устанавливает

    public void setName(String newName) {

        name = newName;
    }

    public void setAge(int newAge) {

        age = newAge;
    }

    public void setIsFullTime(boolean newIsFullTime) {

        isFullTime = newIsFullTime;
    }

    public void setAvr(double newAvr) {

        avr = newAvr;
    }

    public void setFrom(int newFrom) {
        from = newFrom;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public boolean getIsFullTime() {

        return isFullTime;
    }

    public double getAvr() {

        return avr;
    }

    public int getFrom() {

        return from;
    }


}