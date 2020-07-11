package ru.itsjava.hw6;

public class cloth {
    private String brand;
    private String size;
    private String colour;

    public cloth(String brand, String size, String colour) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
