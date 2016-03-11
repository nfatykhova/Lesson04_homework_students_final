package ru.levelp;

import java.rmi.StubNotFoundException;

/**
 * Created by natalie on 05.03.16.
 */

public class MyArrayList {

    private Student[] values;

    public void add(Student value) {

        if (values == null) {
                values = new Student[1];
                values[0] = value;
        } else {
            Student[] temp = new Student[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[temp.length - 1] = value;
            values = temp;
        }
    }

    public int size() {

        if (values == null) {
            return 0;
        }
        return values.length;
    }

    public Student get(int index) {
        // Student - тип, который надо вернуть. [] указали бы на то, что вернется массив этого типа

        if (values == null) {
            System.err.println("Error: ArrayList is empty");
        }
        return values[index];
    }

    public void insert(int index, Student value) {

        // добавляет по индексу, остальное сдвигает

        if (values == null) {
            values = new Student[1];
            values[0] = value;
        } else {

            Student[] temp = new Student[values.length + 1];

            for (int i = 0; i < index; i++) {
                temp[i] = values[i];
            }
            for (int i = index; i < values.length - 1; i++) {
                temp[i + 1] = values[i];
            }
            temp[index] = value;
            values = temp;
        }

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

    public void clear() {

        values = new Student[0];
    }

}
