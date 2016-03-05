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
        MyArrayList list = new MyArrayList();
        Student[] students = new Student[100];
        int a = 0;
        while (true) {
            System.out.println("1. Add student. \n2. Show all students. \n3. Delete student \n4. Exit");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            if (x == 1) {
                if ( a == students.length ) {
                    System.out.println("full");
                    continue;
                }

                list.add(students);
                a++;

            } else if (x == 2) {

                //               students = abcBubbleSort(students);

                Algorithms alg = new Algorithms(); // нельзя вызвать метод класс, пока нет объекта класса!!!
                students = alg.abcBubbleSort(students);
                alg.printArray(students);

            } else if (x == 3) {
                System.out.println("Enter student's name: ");
                String name = scan.next();
                for (int i = 0; i < students.length - 1; i++) {
                    if (students[i].name.equals(name)) list.remove(i);
                }
            } else if (x == 4) break;
        }




    }
}
