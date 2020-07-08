package ru.itsjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 5; //

        num++;

        System.out.println(num);

        double price = 188.0;

        float f1 = 10.0f;
        System.out.println(0.0 / 100);
        System.out.println(0.0 / 0.0);
        //System.out.println (5/0);
        System.out.println(100.0 == 100.0);


        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter number");
        //int numFromConsole = scan.nextInt();

        //System.out.println("num=" + numFromConsole);

//        if (numFromConsole > 5) {
//            System.out.println("Num>5");
//        } else {
//            System.out.println("Num<=5");
//        }

        System.out.println("Enter your Age please");
        int yourAge = scan.nextInt();

        if ((yourAge < 0) && (yourAge > 120)) {
            System.out.println("Invalid age");
        } else if (yourAge > 27) {
            System.out.println("Relax");
        } else if (yourAge < 18) {
            System.out.println("Too young");
        } else  {
            System.out.println("Go to the Army now!");
        }


    }
}








