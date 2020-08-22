package ru.itsjava.base.hw1.hw6;

public class Shop {
    private String name;
    private String location;
    private boolean hasLiquorLicense;

    public Shop(String name, String location, boolean hasLiquorLicense) {
        this.name = name;
        this.location = location;
        this.hasLiquorLicense = hasLiquorLicense;
    }

    public Shop(String name) {
        this.name = name;
    }

    public Shop(boolean hasLiquorLicense) {
        this.hasLiquorLicense = hasLiquorLicense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHasLiquorLicense(boolean hasLiquorLicense) {
        this.hasLiquorLicense = hasLiquorLicense;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isHasLiquorLicense() {
        return hasLiquorLicense;
    }
}

