package com.dasun.firstdev;

abstract class Computer {

    private String brand;
    private String type;
    private String processor;
    private String ram;
    private boolean isBrandnew;
    private int ramType;

    protected Computer(String brand, String type, String processor, String ram, boolean isBrandnew, int ramTypeDDR) {
        this.brand = brand;
        this.type = type;
        this.processor = processor;
        this.ram = ram;
        this.isBrandnew = isBrandnew;
        this.ramType = ramTypeDDR;
    }

    abstract void showDetails(); // abstract method

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isBrandnew() {
        return isBrandnew;
    }

    public void setBrandnew(boolean brandnew) {
        isBrandnew = brandnew;
    }

    public int getRamType() {
        return ramType;
    }

    public void setRamType(int ramType) {
        this.ramType = ramType;
    }


}
