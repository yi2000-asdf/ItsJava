package ru.itsjava.hw7;

public class Square extends Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }
    public double getSquare(){
        double sq=a*a;
        return sq;
    }

    public double getPerimeter() {
        double p = 4*a;
        return p;
    }
}
