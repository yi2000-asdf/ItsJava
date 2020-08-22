package ru.itsjava.javaCore.hw7;

public class Man extends Person {
    public Man() {
        super.setMale(true);
    }

    public Man(int age, String name) {
        super(age, name);
        super.setMale(true);


    }
}
