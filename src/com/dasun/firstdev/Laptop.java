package com.dasun.firstdev;

public class Laptop extends computer {

    private String ScreenSize;
    private int BatteryCells;

    public Laptop(String brand, String type, String processor, String ram, boolean isBrandnew, int ramTypeDDR, String screenSize, int batteryCells) {
        super(brand, type, processor, ram, isBrandnew, ramTypeDDR);
        ScreenSize = screenSize;
        BatteryCells = batteryCells;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public int getBatteryCells() {
        return BatteryCells;
    }

    public void setBatteryCells(int batteryCells) {
        BatteryCells = batteryCells;
    }

    public void showDetails() {

        System.out.println("This Is Laptop Class");

    }
}
