package ru.itsjava.base.hw1.arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = new int[]{-3, 5, 0, 4,6,7,9};

//        System.out.println(numbers[1]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers.length);
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        for (int i = numbers.length-1; i>=0; i--) {
            System.out.print(numbers[i]+";");
        }

        System.out.println();

        for (int i = 0; i<numbers.length; i+=2) {
            System.out.print(numbers[i]+";");
        }

        System.out.println();

        for (int i = 1; i<numbers.length; i+=2) {
            System.out.print(numbers[i]+";");
        }
        System.out.println();

        for (int i = 0; i<4; i++) {
            System.out.print(numbers[i]+";");
        }
        System.out.println();
        for (int i = numbers.length-4; i<numbers.length; i++) {
            System.out.print(numbers[i]+";");
        }

        System.out.println();
//

        for (int i=1;i<6;i++){
            System.out.println ("I love Java");
        }

//        while (true==true){
//            System.out.println ("I love Java");
//        }

        for (int i=0; i==0;i=0){
            System.out.println ("I love Java");

        }
        }
    }

