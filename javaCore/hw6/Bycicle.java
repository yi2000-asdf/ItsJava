package ru.itsjava.javaCore.hw6;

public class Bycicle {
    private String brand;
    private String height;

    public Bycicle(String brand, String height) {
        this.brand = brand;
        this.height = height;
    }

    public String getBrand() {
        return brand;
    }

    public String getHeight() {
        return height;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
