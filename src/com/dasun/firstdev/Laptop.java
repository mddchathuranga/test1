package com.dasun.firstdev;

import javafx.stage.Screen;

import java.security.PublicKey;

public class Laptop extends Computer {

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

    public int getBatteryCells() {
        return BatteryCells;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public void setBatteryCells(int batteryCells) {
        BatteryCells = batteryCells;
    }

    public void ShowDetails(){

        System.out.println("This Is Laptop Class");

    }
}
