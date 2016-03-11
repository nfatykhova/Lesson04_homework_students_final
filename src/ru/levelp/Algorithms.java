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

    private static int compare(String a, String b) {

/*      возвращает
       -1, если строка a раньше по алфавиту, чем b
        0, если строки a и b одинаковы
        1, если строка b раньше, чем a
       ** Сортировка по всем буквам с учетом длины
        */

        int minLen = a.length(); // = Math.min(a.length(), b.length());
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

    // сортировка строк "пузырьком"

    public void abcBubbleSort(MyArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (compare(list.get(j).getName(), list.get(j + 1).getName()) == 1) {
                    Student temp = new Student();
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    // вывод на экран массива студентов

    public void printArray(MyArrayList list) {

        for (int i = 0; i < list.size(); i++ ) {
            list.get(i).print();
        }

        }
    }



