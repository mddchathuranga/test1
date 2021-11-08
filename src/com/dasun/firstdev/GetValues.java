package com.dasun.firstdev;

import java.util.Scanner;

public class GetValues {

    public String brand;
    public String type;
    public String processor;
    public String ram;
    public boolean isBrandNew;
    public int RamTypeDDR;
    public String ScreenSize;
    public int BatteryCells;
    public String MonitorSize;
    public String TowerType;


    public boolean GetValuesFromKeyboard() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Brand Name ");
        this.brand = input.next();

        System.out.println("Please Enter Type");
        this.type = input.next();

        System.out.println("Please Enter Processor Model");
        this.processor = input.next();

        System.out.println("Please Enter Ram Size in GB");
        this.ram = input.next();

        System.out.println("Please Enter TRUE for Brand New FALSE for not");
        this.isBrandNew = input.nextBoolean();

        System.out.println("Please Enter RAM Type DDR?");
        this.RamTypeDDR = input.nextInt();

        if (type.equals("laptop")) {

            System.out.println("This is Laptop Please fill Follow Details");

            System.out.println("Please Enter Laptop Screen Size");
            this.ScreenSize = input.next();
            System.out.println("Please Enter Laptop Battery Cells Amount");
            this.BatteryCells = input.nextInt();
            return true;

        }

        if (type.equals("desktop")) {

            System.out.println("This is Desktop Please fill Follow Details");

            System.out.println("Please Enter Desktop Monitor Size");
            this.MonitorSize = input.next();
            System.out.println("Please Enter Tower Type");
            this.TowerType = input.next();
            return true;

        }

        return true;


    }
}
