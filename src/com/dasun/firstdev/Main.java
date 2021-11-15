package com.dasun.firstdev;

public class Main {

    public static void main(String[] args) {
        GetValues gv = new GetValues();
        gv.getValuesFromKeyboard();
        Calculate adsub = new Calculate();

        if (gv.type.equals("laptop")) {
            Laptop lap = new Laptop(gv.brand, gv.type, gv.processor, gv.ram, gv.isBrandnew, gv.ramType, gv.screenSize, gv.batteryCells);

            System.out.println("this is laptop inherit class");
            System.out.println("values test on parent class Brand is  " + lap.getBrand());
            System.out.println("values test on child class screen size is  " + lap.getScreenSize());

            lap.showDetails(); //  abstract method call for Laptop sub class
        }
        if (gv.type.equals("desktop")) {
            Desktop desk = new Desktop(gv.brand, gv.type, gv.processor, gv.ram, gv.isBrandnew, gv.ramType, gv.monitorSize, gv.towerType);
            System.out.println("this is desktop inherit class");
            System.out.println("values test on parent class Brand is  " + desk.getBrand());
            System.out.println("values test on child class monitor size is  " + desk.getMonitorSize());

            desk.showDetails(); //  abstract method call for Desktop sub class
        }


        System.out.println("Addition = " + adsub.add(11, 5));
        System.out.println("Substaction =" + adsub.sub(10, 3));


    }
}
