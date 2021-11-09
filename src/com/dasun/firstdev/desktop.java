package com.dasun.firstdev;

public class desktop extends computer {
    private String MonitorSize;
    private String TowerType;

    public desktop(String brand, String type, String processor, String ram, boolean isBrandnew, int ramTypeDDR, String monitorSize, String towerType) {
        super(brand, type, processor, ram, isBrandnew, ramTypeDDR);
        MonitorSize = monitorSize;
        TowerType = towerType;
    }

    public String getMonitorSize() {
        return MonitorSize;
    }

    public String getTowerType() {
        return TowerType;
    }

    public void setMonitorSize(String monitorSize) {
        MonitorSize = monitorSize;
    }

    public void setTowerType(String towerType) {
        TowerType = towerType;
    }

    public void showDetails(){

        System.out.println("This Is Desktop Class");

    }
}


