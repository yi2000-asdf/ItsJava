package ru.itsjava.hw7;

public class Woman extends Person {
    public Woman() {
        super.setMale(false);
    }

    public Woman(int age, String name) {
        super(age, name);
        super.setMale(false);


    }
}
