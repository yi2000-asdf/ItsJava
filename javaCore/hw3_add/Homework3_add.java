package ru.itsjava.javaCore.hw3_add;

import java.util.Scanner;

/*
Доп задачи:
1. Посчитать сумму четных цифр числа
2. Посчитать произведение нечетных цифр числа
3. Пользователь вводит число. А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Homework3_add {
    public static void main(String args[]) {

        task_1();
        task_2();
         task_3();

    }


    static void task_1() {
        //Посчитать сумму четных цифр числа

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number, please");
        int num = Scan.nextInt();
        String str = "" + num;
        int numLength = str.length();
        char ch;
        int result = 0;


        for (int i = 0; i < numLength; i++) {
            ch = str.charAt(i);
            int value = Character.getNumericValue(ch);


            if (value % 2 == 0) {
                result += value;

            }


        }
        System.out.println("Total of even is " + result);


    }

    static void task_2() {
        //Посчитать произведение нечетных цифр числа

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number, please");
        int num = Scan.nextInt();
        String str = "" + num;
        int numLength = str.length();
        char ch;
        int result = 1;


        for (int i = 0; i < numLength; i++) {
            ch = str.charAt(i);
            int value = Character.getNumericValue(ch);


            if (value % 2 == 1) {
                result *= value;

            }


        }
        System.out.println("Mult. of odd is " + result);


    }

    static void task_3() {
        //Пользователь вводит число. А программа суммирует все числа от 1 до введенного пользователем числа
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number, please");
        int num = Scan.nextInt();

        int result = 0;


        for (int i = 1; i <= num; i++) {

            result += i;


        }
        System.out.println("Sum of each numbers " + " is " + result);
    }


}
