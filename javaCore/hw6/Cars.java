package ru.itsjava.javaCore.hw6;

public class Cars {
    private String brand;
    private int hp;
    private String colour;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Cars(String brand, int hp, String colour) {
        this.brand = brand;
        this.hp = hp;
        this.colour = colour;
    }

    public Cars(String brand) {
        this.brand = brand;
    }

    public Cars(int hp, String colour) {
        this.hp = hp;
        this.colour = colour;
    }
}
