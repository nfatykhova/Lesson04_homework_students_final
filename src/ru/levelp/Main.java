package ru.levelp;

/**
 * Created by Nataly on 02.03.2016.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    /*
    1 - Добавить студента
    2 - Вывести список студентов
    3 - Выйти из программы
    1:
        Введите имя: ...
        Введите возраст: ...
    2:
        print()
     */
        Student[] students = new Student[100];
        for (int a = 0; a < students.length - 1; a++) {
            System.out.println("1. Add student. \n2. Show all students. \n3. Exit");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            if (x == 1) {
                students[a] = new Student();
                System.out.println("Enter name: ");
                students[a].name = scan.next();
                System.out.println("Enter age: ");
                students[a].age = scan.nextInt();
                System.out.println("Enter fulltime status: ");
                students[a].isFullTime = scan.nextBoolean();
                System.out.println("Enter average score: ");
                students[a].avr = scan.nextDouble();
            } else if (x == 2) {
                int b = 0;
                while (students[b] != null) {
                    students[b].print();
                    b++;
                }
            } else if (x == 3) break;
        }




    }
}
