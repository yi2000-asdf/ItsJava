package ru.itsjava.base.hw1.hw6;

public class Cow {
    private final String name;
    private  String nameBreed;


    public Cow(String name, String nameBreed) {
        this.name = name;
        this.nameBreed = nameBreed;
    }

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNameBreed() {
        return nameBreed;
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
}
