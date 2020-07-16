package ru.itsjava.hw7;

public class Rectangle extends Shape {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public double getSquare() {
        double sq = a * b;
        return sq;
    }

    public double getPerimeter() {
        double p = 2 * a + 2 * b;
        return p;
    }
}
