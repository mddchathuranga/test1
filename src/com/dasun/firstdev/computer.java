package com.dasun.firstdev;

abstract class computer {

    private String brand;
    private String type;
    private String processor;
    private String ram;
    private boolean IsBrandnew;
    private int RamTypeDDR;

    public computer(String brand, String type, String processor, String ram, boolean isBrandnew, int ramTypeDDR) {
        this.brand = brand;
        this.type = type;
        this.processor = processor;
        this.ram = ram;
        IsBrandnew = isBrandnew;
        RamTypeDDR = ramTypeDDR;
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
        return IsBrandnew;
    }

    public void setBrandnew(boolean brandnew) {
        IsBrandnew = brandnew;
    }

    public int getRamTypeDDR() {
        return RamTypeDDR;
    }

    public void setRamTypeDDR(int ramTypeDDR) {
        RamTypeDDR = ramTypeDDR;
    }


}
