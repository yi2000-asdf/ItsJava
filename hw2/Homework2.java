package ru.itsjava.hw2;
/*
1. Программа по определению високосного года
2. Найти максимум из двух чисел
3. Найти минимум из двух чисел
4. Поменять значение двух переменных не используя третью
5. Найти корни квадратного уравнения
6. Проверить делимость на 5
7. Вывести число вида: num = d * 5 + r Например, 21 = 4 * 5 + 1 (делитель 5)
8. Найти максимум из трех чисел
9. Найти среднее из трех чисел
10. Найти сумму цифр двухзначного числа 95 -> 14
 */

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

    public static void main(String args[]) {
        task1_leapYear();
        task2_max();
        task3_min();
        task4_changeTwoNumbers();
        task5_square();
        task6_del5();
        task8_max3();
        task9_mid3();
        task10_sum2();


    }

    public static void task10_sum2() {
        int a, num1, num2, result;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a, double digit");
        a = scan.nextInt();
        num1 = a / 10;
        num2 = a % 10;
        result = num1 + num2;
        System.out.println(result);


    }

    public static void task9_mid3() {


        Scanner scan = new Scanner(System.in);
        int a, b, c, mid;

        int[] array = new int[3];

        System.out.println("Enter a");
        array[0] = scan.nextInt();
        System.out.println("Enter b");
        array[1] = scan.nextInt();
        System.out.println("Enter c");
        array[2] = scan.nextInt();

        Arrays.sort(array);
        System.out.println("mid is " + array[1]);
    }

    public static void task8_max3() {
        Scanner scan = new Scanner(System.in);
        int a, b, c, max;
        System.out.println("Enter a");
        a = scan.nextInt();
        System.out.println("Enter b");
        b = scan.nextInt();
        System.out.println("Enter c");
        c = scan.nextInt();
        max = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }


        System.out.println("Max is " + max);
    }

    public static void task6_del5() {
        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("Enter a");
        a = scan.nextInt();
        double b;
        b = a % 5;
        if (b == 0) {
            System.out.println(a + " can divide by 5");
        } else {
            System.out.println(a + " can not divide by 5");
        }

    }

    public static void task5_square() {
        double a, b, c, d;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a");
        a = scan.nextDouble();
        System.out.println("Enter b");
        b = scan.nextDouble();
        System.out.println("Enter c");
        c = scan.nextDouble();

        d = b * b - 4 * a * c;

        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("root: x = " + x);
        } else {
            System.out.println("has no roots");
        }
    }


    public static void task4_changeTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = scan.nextInt();
        System.out.println("Enter num 2");
        int num2 = scan.nextInt();
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("Num1 is " + num1 + " now");
        System.out.println("Num2 is  " + num2 + " now");


    }

    public static void task3_min() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = scan.nextInt();
        System.out.println("Enter num 2");
        int num2 = scan.nextInt();
        if (num1 < num2) {
            System.out.println("Min is num1: " + num1);
        } else if (num1 == num2) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("Min is num2: " + num2);
        }


    }

    public static void task2_max() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = scan.nextInt();
        System.out.println("Enter num 2");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println("Max is num1: " + num1);
        } else if (num1 == num2) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("Max is num2: " + num2);
        }


    }

    public static void task1_leapYear() {
/*
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
 */

        boolean leapYear = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year, please");
        int year = scan.nextInt();

        int rest400 = year % 400;
        int rest100 = rest400 % 100;

        //System.out.println(year % 400);
        //System.out.println(rest100);
        if ((year % 400 == 0) && (year % 100 == 0)) {
            leapYear = true;

        } else if ((rest100 % 4 == 0) && (year % 100 > 0)) {
            leapYear = true;
        }

        if (leapYear == true) {
            System.out.println(" " + year + " is a leap year");
        } else {
            System.out.println(" " + year + " is NOT a leap year");
        }

    }
}


