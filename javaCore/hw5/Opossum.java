package ru.itsjava.javaCore.hw5;

public class Opossum {
     final String name;
     public int height;

    public Opossum(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Opossum(String name) {
        this.name = name;

    }
     public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void sayHakunaMatata(){
        System.out.println("My name is " + this.name+" Hakuna Matata");
    }


}
