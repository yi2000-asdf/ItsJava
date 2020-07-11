package ru.itsjava.hw6;

public class Telephone {
    private String brand;
    private String colour;
    private double screenWidth;

    public Telephone(String brand, String colour, double screenWidth) {
        this.brand = brand;
        this.colour = colour;
        this.screenWidth = screenWidth;
    }

    public Telephone(String brand) {
        this.brand = brand;
    }

    public Telephone(double screenWidth) {
        this.screenWidth = screenWidth;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setScreenWidth(double screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public double getScreenWidth() {
        return screenWidth;
    }
}
