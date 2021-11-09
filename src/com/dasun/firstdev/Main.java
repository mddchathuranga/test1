package com.dasun.firstdev;

public class Main {

    public static void main(String[] args) {

        getValues gv = new getValues();
        gv.getValuesFromKeyboard();
        addSub adsub = new addSub();

        if (gv.type.equals("laptop")){
            Laptop lap = new Laptop(gv.brand,gv.type, gv.processor, gv.ram, gv.isBrandNew, gv.ramTypeDDR, gv.screenSize, gv.batteryCells);

            System.out.println("this is laptop inherit class");
            System.out.println("values test on parent class Brand is  "+lap.getBrand());
            System.out.println("values test on child class screen size is  "+lap.getScreenSize());

            lap.showDetails(); //  abstract method call for Laptop sub class
        }
        if (gv.type.equals("desktop")){
            desktop desk = new desktop(gv.brand,gv.type, gv.processor, gv.ram, gv.isBrandNew, gv.ramTypeDDR, gv.monitorSize, gv.towerType);
            System.out.println("this is desktop inherit class");
            System.out.println("values test on parent class Brand is  "+desk.getBrand());
            System.out.println("values test on child class monitor size is  "+desk.getMonitorSize());

            desk.showDetails(); //  abstract method call for Desktop sub class
        }


        System.out.println("Addition = "+ adsub.add(11,5));
        System.out.println("Substaction ="+ adsub.sub(10,3));


    }
}
