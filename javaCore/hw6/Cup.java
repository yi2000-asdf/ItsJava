package ru.itsjava.javaCore.hw6;

public class Cup {
    private String colour;
    private final int volume;

    public void setColour(String colour) {
        this.colour = colour;
    }


    public String getColour() {
        return colour;
    }

    public int getVolume() {
        return volume;
    }

    public Cup(int volume) {
        this.volume = volume;
    }

    public Cup(String colour, int volume) {
        this.colour = colour;
        this.volume = volume;
    }
}
