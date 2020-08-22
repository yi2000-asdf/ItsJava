package ru.itsjava.javaCore.methods;

public class MethodsPractice {
    public static void main(String args[]) {

        int max = getMaxValue(3, 5);
        System.out.println(max);
        int max2=getMaxValue(9,7);
        System.out.println(max2);


    }

    public static int getMaxValue(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }

    }
}
