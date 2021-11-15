package com.dasun.firstdev;

public class Laptop extends Computer {

    private String screenSize;
    private int batteryCells;

    public Laptop(String brand, String type, String processor, String ram, boolean isBrandnew, int ramTypeDDR, String screenSize, int batteryCells) {
        super(brand, type, processor, ram, isBrandnew, ramTypeDDR);
        this.screenSize = screenSize;
        this.batteryCells = batteryCells;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryCells() {
        return batteryCells;
    }

    public void setBatteryCells(int batteryCells) {
        this.batteryCells = batteryCells;
    }

    public void showDetails() {

        System.out.println("This Is Laptop Class");

    }
}
