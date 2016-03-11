package ru.levelp;

/**
 * Created by Nataly on 02.03.2016.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    /*
    1 - Добавить студента
    2 - Вывести список студентов
    3 - Удалить
    4 - Выйти из программы
    1:
        Введите имя: ...
        Введите возраст: ...
    2:
        print()
     */
        MyArrayList list = new MyArrayList();
        Algorithms alg = new Algorithms();

        while (true) {
            System.out.println("1. Add student. \n2. Show all students. \n3. Delete student \n4. Exit");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            if (x == 1) {

                System.out.println("Enter name: ");
                String name = scan.next();
                System.out.println("Enter age: ");
                int age = scan.nextInt();
                System.out.println("Enter fulltime status: ");
                boolean isFullTime = scan.nextBoolean();
                System.out.println("Enter average score: ");
                double avr = scan.nextDouble();
                System.out.println("Enter citizenship: ");
                int from = scan.nextInt();
                Student st = new Student(name, age, isFullTime, avr, from);

                list.add(st);

            } else if (x == 2) {

                alg.abcBubbleSort(list);
                alg.printArray(list);

            } else if (x == 3) {
                System.out.println("Enter student's name: ");
                String name = scan.next();
                for (int i = 0; i < list.size(); i++) {
                    String temp = list.get(i).getName();
                    if (name.equals(temp)) list.remove(i);
                }

            } else if (x == 4) break;
        }
    }
}
