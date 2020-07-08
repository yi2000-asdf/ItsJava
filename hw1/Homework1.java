package ru.itsjava.hw1;

public class Homework1 {
    public static void main(String[] args) {

        task1();
        task2();
        task2_1();
        task4();
    }

    public static void task4() {
        int b = 4;
        int s = 5;
        System.out.println(b);
        System.out.println(s);
        System.out.println(b & s);
        System.out.println(b * s);
    }

    public static void task2_1() {
        boolean A;
        boolean B;


        System.out.println("   A    " + "   B    " + "   !A    " + "   A&B    " + "   A|B    " + "   A^B    ");
        //step1;
        A = true;
        B = true;
        System.out.println("  " + A + "  " + "  " + B + "  " + "   " + !A + "  " + "  " + (A && B) + "  " + "   " + (A | B) + "  " + "    " + (A ^ B) + "  ");

        //step2;
        A = true;
        B = false;
        System.out.println("  " + A + "  " + "  " + B + "  " + "  " + !A + "  " + " " + (A && B) + "  " + "   " + (A | B) + "   " + "   " + (A ^ B) + "  ");

        //step3;
        A = false;
        B = true;
        System.out.println("  " + A + "  " + " " + B + "  " + "   " + !A + "  " + "  " + (A && B) + "  " + "   " + (A | B) + "  " + "    " + (A ^ B) + "  ");

        //step4;
        A = false;
        B = false;
        System.out.println("  " + A + "  " + " " + B + "  " + "  " + !A + "  " + "  " + (A && B) + "  " + "   " + (A | B) + "  " + "   " + (A ^ B) + "  ");
    }

    public static void task2() {
        boolean A;
        boolean B;
        //1
        A = true;
        B = true;
        System.out.println("Step1. A=" + A + "; B=" + B);
        System.out.print("!A=" + !A);
        System.out.print("; A&B=" + (A && B));
        System.out.print("; A|B=" + (A | B));
        System.out.println(";A^B=" + (A ^ B));

        //2
        A = true;
        B = false;
        System.out.println("Step2. A=" + A + "; B=" + B);
        System.out.print("!A=" + !A);
        System.out.print("; A&B=" + (A && B));
        System.out.print("; A|B=" + (A | B));
        System.out.println(";A^B=" + (A ^ B));

        //3
        A = false;
        B = true;
        System.out.println("Step4. A=" + A + "; B=" + B);
        System.out.print("!A=" + !A);
        System.out.print("; A&B=" + (A && B));
        System.out.print("; A|B=" + (A | B));
        System.out.println(";A^B=" + (A ^ B));
        //4
        A = false;
        B = false;
        System.out.println("Step4. A=" + A + "; B=" + B);
        System.out.print("!A=" + !A);
        System.out.print("; A&B=" + (A && B));
        System.out.print("; A|B=" + (A | B));
        System.out.println(";A^B=" + (A ^ B));


    }

    public static void task1() {
        int num1 = 4;
        int num2 = 5;

        double rez;

        rez = (double) num1 / num2;
        System.out.println(rez);

        rez = num1 * num2;
        System.out.println(rez);

        rez = num1 - num2;
        System.out.println(rez);

        rez = num1 + num2;
        System.out.println(rez);

        rez = num1 % 2;
        System.out.println(rez);

        rez = num2 % 2;
        System.out.println(rez);

        ////////////////////////////////////////////////////////
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 == num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 != num2);
        ////////////////////////////////////////////////////////
        // num1=4; num2=5;
        System.out.println((rez == 5) && (num1 + num2 == 6));
        System.out.println((rez == 5) || (num1 + num2 == 9));
        System.out.println(num1 + num2 != 9);
        System.out.println((rez == 5) ^ (num1 + num2 == 19));


    }
}
