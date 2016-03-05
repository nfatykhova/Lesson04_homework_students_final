package ru.levelp;

/**
 * Created by natalie on 05.03.16.
 */

import java.util.Scanner;
public class MyArrayList {

    Student[] values;
    Scanner scan = new Scanner(System.in);

    public void add() {

        if (values == null) {
                values = new Student[1];
                values[0] = new Student();
                System.out.println("Enter name: ");
                values[0].name = scan.next();
//                System.out.println("Enter age: ");
//                values[0].age = scan.nextInt();
//                System.out.println("Enter fulltime status: ");
//                values[0].isFullTime = scan.nextBoolean();
//                System.out.println("Enter average score: ");
//                values[0].avr = scan.nextDouble();

        } else {
            Student[] temp = new Student[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[temp.length - 1] = new Student();
            System.out.println("Enter name: ");
            temp[temp.length - 1].name = scan.next();
//            System.out.println("Enter age: ");
//            temp[temp.length - 1].age = scan.nextInt();
//            System.out.println("Enter fulltime status: ");
//            temp[temp.length - 1].isFullTime = scan.nextBoolean();
//            System.out.println("Enter average score: ");
//            temp[temp.length - 1].avr = scan.nextDouble();

            values = temp;
        }
    }

    public String getName(int index) {
        // возвращает значение переменной students[i].name
        if (values == null) {
            System.err.println("Error: ArrayList is empty");
        }
        return values[index].name;
    }

    public int size() {

        if (values == null) {
            return 0;
        }
        return values.length;
    }

    public void remove(int index) {
        // удаляет n-ный эл-т из массива - уменьшает размер массива
        // return значение удаленного эл-та

        if (values == null) {
            System.err.println("Error: ArrayList is empty");
        }

        Student[] temp = new Student[values.length - 1];

        if (index < values.length - 1) {

            for (int i = 0; i < index; i++) {
                temp[i] = values[i];
            }

            for (int i = index; i < values.length - 1; i++) {
                temp[i] = values[i + 1];
            }

        } else if (index == values.length - 1) {
            for (int i = 0; i < index; i++) {
                temp[i] = values[i];
            }
        }
        values = temp;
    }


//    public void insert(int index, int value) {
//        // добавляет по индексу, остальное сдвигает
//
//        if (values == null) {
//            values = new Student[1];
//            values[0] = value;
//
//        } else {
//
//            int[] temp = new int[values.length + 1];
//
//            for (int i = 0; i < index; i++) {
//                temp[i] = values[i];
//            }
//            for (int i = index; i < values.length; i++) {
//                temp[i + 1] = values[i];
//            }
//            temp[index] = value;
//            values = temp;
//        }
//
//    }

    public void clear() {

        Student[] temp = new Student[0];
        values = temp;
    }

    public Student[] abcBubbleSort() {

        Algorithms alg = new Algorithms();

        int i;
        for (i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                int k = j + 1;
                if ((values[j] != null) && (values[k] != null)) {
                    int comp = alg.compare(values[j].name, values[k].name);
                    if (comp == 1) {
                        Student temp = values[j];
                        values[j] = values[k];
                        values[k] = temp;
                    }
                }

            }
        }

        return values;
    }

    public void printArray() {
        int b = 0;
        while ((b < values.length) && (values[b] != null)) {
            values[b].print();
            b++;
        }

    }
}
