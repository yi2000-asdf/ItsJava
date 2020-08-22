package ru.itsjava.base.hw1.hw7;

public class Person {
    private int age;
    private String name;
    private boolean isMale;


    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void printAge() {
        int nage;
        if (this.isMale == true) {
            nage = this.age;
        } else {
            if (this.age > 18) {
                nage = 18;
            } else {
                nage = this.age;
            }
        }

        System.out.println("My name is " + this.name + " I am " + nage + " years old.");
    }


}

