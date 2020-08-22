package ru.itsjava.javaCore.hw7;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSquare() {
        double p = 0.5 * (a + b + c);
        return 0;// Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        double p = a + b + c;
        return p;
    }
}
