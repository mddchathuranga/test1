package com.dasun.firstdev;

abstract class computer {

    private String brand;
    private String type;
    private String processor;
    private String ram;
    private boolean IsBrandnew;
    private int RamTypeDDR;

    abstract void showDetails(); // abstract method

    public computer(String brand, String type, String processor, String ram, boolean isBrandnew, int ramTypeDDR) {
        this.brand = brand;
        this.type = type;
        this.processor = processor;
        this.ram = ram;
        IsBrandnew = isBrandnew;
        RamTypeDDR = ramTypeDDR;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public boolean isBrandnew() {
        return IsBrandnew;
    }

    public int getRamTypeDDR() {
        return RamTypeDDR;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setBrandnew(boolean brandnew) {
        IsBrandnew = brandnew;
    }

    public void setRamTypeDDR(int ramTypeDDR) {
        RamTypeDDR = ramTypeDDR;
    }


}
