package ru.itsjava.javaCore.hw6;

public class Notebook {
    private String brand;
    private String colour;
    private int memory;
    private int diskSize;
    private boolean hasDVD;

    public Notebook(String brand, String colour, int memory, int diskSize, boolean hasDVD) {
        this.brand = brand;
        this.colour = colour;
        this.memory = memory;
        this.diskSize = diskSize;
        this.hasDVD = hasDVD;
    }

    public Notebook(String colour, int memory, int diskSize, boolean hasDVD) {
        this.colour = colour;
        this.memory = memory;
        this.diskSize = diskSize;
        this.hasDVD = hasDVD;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getMemory() {
        return memory;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public boolean isHasDVD() {
        return hasDVD;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    public void setHasDVD(boolean hasDVD) {
        this.hasDVD = hasDVD;
    }
}
