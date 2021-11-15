package com.dasun.patterns.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();

        Computer computer1 = computerFactory.getComputer("laptop");
        computer1.showDetails();

        Computer computer2 = computerFactory.getComputer("desktop");
        computer2.showDetails();

        Computer computer3 = computerFactory.getComputer("micro");
        computer3.showDetails();

    }

}
