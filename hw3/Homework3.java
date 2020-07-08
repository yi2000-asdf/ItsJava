package ru.itsjava.hw3;
/*
1. Вывести 10 раз: "Я люблю Java!» (цикл while)
2. Найти сумму цифр числа. 545 -> (5 + 4 + 5 =) 14
3. Вывести все делители числа 15 -> 15, 5, 3, 1
4. Вывести третий и пятый элементы массива (задачи на массив)
5. Вывести длину массива
6. Написать 3 раза "Я люблю писать программы на Java!» (цикл for)
7. Вывести элементы с четными индексами
8. Вывести элементы с нечетными индексами
9. Вывести первые 4 элемента
10. Вывести последние 4 элемента
11. Вывести в обратном порядке каждый 3 элемент
 */

import java.util.Scanner;

public class Homework3 {
    public static void main(String args[]) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_6();


    }

    static void task_1() {
        int counter = 0;
        while (counter < 10) {
            System.out.println("I love Java");
            counter++;
        }
    }

    static void task_2() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number, please");
        int num = Scan.nextInt();
        String str = "" + num;
        int numLength = str.length();
        char ch;
        int result = 0;


        for (int i = 0; i <= numLength - 1; i++) {
            ch = str.charAt(i);
            result += Character.getNumericValue(ch);

        }
        System.out.println("Result is " + result);


    }

    static void task_3() {
        //Вывести все делители числа 15 -> 15, 5, 3, 1
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number, please");
        int num = Scan.nextInt();

        // перебрать все числа начиная
        // с самого числа и до 1
        // вывести те, которые делятся без остатка

        System.out.println();
        System.out.print("Denominantors the number " + num + " are: ");


        for (int i = num; i > 0; i--) {

            if (num % i == 0) {
                System.out.print(i + "; ");
            }
        }
        System.out.println();


    }

    static void task_4() {
        int[] array = new int[]{1, 5, 8, 8, 7, 66, 77, 0, -3, 15};
        System.out.println("The Third element of the Array, value: " + array[2]);
        System.out.println("The Fifth element of the Array, value: " + array[4]);
        task_5(array);
        task_7(array);
        task_8(array);
        task_9(array);
        task_10(array);
        task_11(array);
    }

    static void task_5(int[] array) {
        System.out.println("Arrays length is: " + array.length);
    }

    static void task_6() {
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Я люблю писать программы на Java!");

        }
    }

    static void task_7(int[] array) {
        //Вывести элементы с четными индексами
        for (int i = 0; i <= array.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println("Arrays index is: " + i + " (even), value is " + array[i]);
            }

        }

    }

    static void task_8(int[] array) {
        //Вывести элементы с нечетными индексами
        for (int i = 0; i <= array.length - 1; i++) {
            if (i % 2 != 0) {
                System.out.println("Arrays index is: " + i + " (odd), value is " + array[i]);
            }
        }
    }

    static void task_9(int[] array) {
        //Вывести первые 4 элемента
        System.out.print("first 4: ");
        for (int i = 0; i < 4; i++) {

            System.out.print(array[i] + ";");

        }
    }

    static void task_10(int[] array) {
        //Вывести последние 4 элемента
        System.out.println();
        System.out.print("last 4: ");
        for (int i = array.length - 1; i > array.length - 5; i--) {

            System.out.print(array[i] + ";");

        }
    }

    static void task_11(int[] array) {
        //Вывести в обратном порядке каждый 3 элемент
        System.out.println();
        System.out.print("each third from the end ");
        int n = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            n++;
            if (n == 3) {
                n = 0;
                System.out.print(array[i] + ";");
            }


        }
    }
}
