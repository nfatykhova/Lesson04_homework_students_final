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

        char[] char1 = a.toCharArray(); // преобразуем строки в массив char
        char[] char2 = b.toCharArray();

         if (char1[0] < char2[0]) return -1;
          else if (char1[0] == char2[0]) return 0;
          else return 1;

        }

    public Student[] abcBubbleSort(Student[] students) {

        int i;
        for (i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                int k = j + 1;
                int comp = compare(students[j].name, students[k].name);
                if (comp == 1) {
                    int temp = j;
                    k = j;
                    j = temp;
                }
            }
        }
        return
        int b = 0;
        while (students[b] != null) {
            students[b].print();
            b++;
        }


    }

}
