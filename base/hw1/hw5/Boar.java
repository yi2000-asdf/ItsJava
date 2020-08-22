package ru.itsjava.base.hw1.hw5;

public class Boar {
    final String name;
    public int weight;

    public Boar(String name) {
        this.name = name;
    }

    public Boar(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    public static void grunt(){
        System.out.println ("Look at me, I am grunting, gr, gr!");

    }
    public void introduce(){
        System.out.println ("My name is "+this.name+", I am a boar. Nice to see you.");
    }
}
