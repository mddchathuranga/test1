package com.dasun.firstdev;

public class Desktop extends Computer {
    private String monitorSize;
    private String towerType;

    public Desktop(String brand, String type, String processor, String ram, boolean isBrandnew, int ramTypeDDR, String monitorSize, String towerType) {
        super(brand, type, processor, ram, isBrandnew, ramTypeDDR);
        this.monitorSize = monitorSize;
        this.towerType = towerType;
    }

    public String getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(String monitorSize) {
        this.monitorSize = monitorSize;
    }

    public String getTowerType() {
        return towerType;
    }

    public void setTowerType(String towerType) {
        this.towerType = towerType;
    }

    public void showDetails() {

        System.out.println("This Is Desktop Class");

    }
}


