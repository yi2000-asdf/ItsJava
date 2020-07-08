package ru.itsjava.hw4;

import java.util.Arrays;

public class Homework4 {
    public static void main(String args[]) {
        int[] array = new int[]{1, 5, -9, 0, 12, -15, 15, 10, 20, 20,-400,100, 50, 18, 4, 17, 4, 1, 7};
        task1(array);
        task2(array);
        task3(array);
        task4(array);
        task5(array);
        task6(array);
        task7(array);
        task8(array);
        task9(array);
        task10(array);
        task11(array);
        task12(array);

    }

    static void task1(int[] array) {
        //Вывести элементы большие нуля в обратном порядке
        System.out.print("Elements above zero ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 0) {

                System.out.print(array[i] + "; ");

            }
        }
        System.out.println();
    }

    static void task2(int[] array) {
        //Вывести индексы элементов равных нулю
        System.out.print("If indexes are equal 0: ");
        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] == 0) {

                System.out.print(i + "; ");

            }
        }
        System.out.println();
    }

    static void task3(int[] array) {
        //Произведение всех элементов массива
        System.out.print("Arrays multiplication: ");
        int res = 1;
        for (int i = 0; i < array.length; i++) {

            res = res * array[i];

        }
        System.out.print(res + "; ");
        System.out.println();
    }

    static void task4(int[] array) {
        //Найти среднеарифметическое массива
        int sum = 0;
        System.out.print("Average: ");
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];

        }
        double average = (double) sum / array.length;

        System.out.print(average + "; ");
        System.out.println();
    }

    static void task5(int[] array) {
        //Найти сумму элементов с четными индексами

        int sum = 0;
        System.out.print("Sum of even indexes: ");
        for (int i = 0; i < array.length; i += 2) {

            sum = sum + array[i];

        }

        System.out.print(sum + "; ");
        System.out.println();
    }

    static void task6(int[] array) {
        //Произведение элементов с нечетными индексами
        int sum = 0;
        System.out.print("Sum of odd indexes: ");
        for (int i = 1; i < array.length; i += 2) {

            sum = sum + array[i];

        }

        System.out.print(sum + "; ");
        System.out.println();
    }

    static void task7(int[] array) {
        //Найти минимальный элемент массива
        //Произведение элементов с нечетными индексами
        int min = array[0];
        System.out.print("Min element: ");
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }

        System.out.print(min + "; ");
        System.out.println();
    }

    static void task8(int[] array) {
        //Найти сумму отрицательных элементов массива
        int sum = 0;
        System.out.print("Sum of negative: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum = sum + array[i];
            }

        }

        System.out.print(sum + "; ");
        System.out.println();
    }

    static void task9(int[] array) {
        //Вывести элементы делящиеся на 5

        System.out.print("Can divide by 5: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.print(array[i] + "; ");
            }

        }


        System.out.println();
    }

    static void task10(int[] array) {
        //Найти 2 максимальных элемента массива, элементы не повторяются

        int countOfMax = 0;
        int[] newArray = new int[2];

        Arrays.sort(array);
        newArray[0] = array[array.length-1];

        System.out.print("Two max: ");
        int count = array.length-2;
        while (true) {

            if (array[count] == newArray[0]) {

            } else {
                newArray[1] = array[count];
                break;
            }

            count  --;
            if (array.length < 0) {
                break;
            }

        }

        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+";");
        }
        System.out.println();

    }

    static void task11(int[] array) {
        //Найти индекс элемента равного 10
        System.out.print("Index of value=10: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10)
                System.out.print(i + "; ");
        }


        System.out.println();
    }

    static void task12(int[] array) {
//        12. Вывести на экран "Хороший массив",
//        если в нем по крайне мере 3 положительных элемента

        System.out.print("Is good array?: ");
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                m += array[i];
            }

        }

        if (m > 2) {
            System.out.print(m > 2);
        }

        System.out.println();
    }
}
