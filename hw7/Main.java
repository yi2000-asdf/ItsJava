package ru.itsjava.hw7;

public class Main {
    public static void main(String args[]) {
        Cat murka = new Cat();
        Lion mufasa = new Lion();
        murka.sayMeow();
        Cat bagira = new Panter();
        bagira.sayMeow();

        Person person=new Person (25,"Anya",false);
        person.printAge();

        Man mike=new Man(30,"Mike");
        mike.printAge();

        Woman joanne=new Woman(30,"Joanne");
        joanne.printAge();

        Shape triangle=new Triangle(5,4,6);
        double sq= triangle.getSquare();
        double p1= triangle.getPerimeter();

        System.out.println ("Triangle: square: "+sq+" perimeter "+p1);


        Shape rectangle=new Rectangle(5,4);
        double sq1= rectangle.getSquare();
        double p2= rectangle.getPerimeter();

        System.out.println ("Rectangle: square: "+sq1+" perimeter "+p2);

        Shape square=new Square(25);
        double sq2= square.getSquare();
        double p3= square.getPerimeter();

        System.out.println ("Square: "+sq2+" perimeter "+p3);



    }
}
