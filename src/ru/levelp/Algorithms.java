package ru.levelp;

/**
 * Created by Nataly on 02.03.2016.
 */

/*
2) Создать класс Algorithms с двумя методами:
        НЕ ПРИМЕНЯТЬ СТАНДАРТНЫЕ МЕТОДЫ СРАВНЕНИЯ СТРОК И СОРТИРОВКИ
        1. public int compare(String a, String b)
        возвращает -1, если строка a раньше по алфавиту, чем b
        0, если строки a и b одинаковы
        1, если строка b раньше, чем a
        Уровни сложности (рекомендуется выполнять в этом порядке):
        * Сортировка только по первой букве
        ** Сортировка по всем буквам с учетом длины
        Алексей             Алекс
        Алекс       ->      Александр
        Александр           Алексей
        2. public Student[] abcBubbleSort(Student[] students)
        получает массив студентов,
        сортирует его по алфавиту,
        возвращает отсортированные массив
        3) Вывод студентов на экран всегда в отсортированном по алфавиту
        (по имени) виде
        */

public class Algorithms {

    public int compare(String a, String b) {

/*      возвращает
       -1, если строка a раньше по алфавиту, чем b
        0, если строки a и b одинаковы
        1, если строка b раньше, чем a
       ** Сортировка по всем буквам с учетом длины
        */

        int minLen = a.length();
        if (b.length() < minLen )
            minLen = b.length();

        int r = 0;
        while (r < minLen) {
            if (a.charAt(r) < b.charAt(r)) return -1;
            if (a.charAt(r) > b.charAt(r)) return 1;
            if (a.charAt(r) == b.charAt(r)) r++;
        }
        if ( a.length() < b.length() ) return -1;
        if ( a.length() > b.length() ) return 1;
        else return 0;
    }

    public Student[] abcBubbleSort(Student[] students) {

        int i;
        for (i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                int k = j + 1;
                if ((students[j] != null) && (students[k] != null)) {
                    int comp = compare(students[j].name, students[k].name);
                    if (comp == 1) {
                        Student temp = students[j];
                        students[j] = students[k];
                        students[k] = temp;
                    }
                }

            }
        }

        return students;

    }

    public void printArray(Student[] students) {
        int b = 0;
        while ((b < students.length) && (students[b] != null)) {
            students[b].print();
            b++;
        }

        }
    }



