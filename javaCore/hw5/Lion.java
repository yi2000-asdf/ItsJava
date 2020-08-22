package ru.itsjava.javaCore.hw5;

public class Lion {
    final String name;
    public int age;
    public int height;
    public int weight;
    public boolean hasmane;

    public Lion(String name) {
        this.name = name;
    }

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Lion(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Lion(String name, int age, int height, int weight, boolean hasmane) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hasmane = hasmane;
    }

    public static void sayHi(Lion lion){
        System.out.println ("I am the King of all animals! My name is "+lion.name);
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHasmane(boolean hasmane) {
        this.hasmane = hasmane;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHasmane() {
        return hasmane;
    }

    public int getWeight() {
        return weight;
    }
}
