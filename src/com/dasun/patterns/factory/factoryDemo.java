package com.dasun.patterns.factory;

public class factoryDemo {

    public static void main(String[] args) {

        computerFactory computerFactory=new computerFactory();

        computer computer1 = computerFactory.getComputer("laptop");
        computer1.showDetails();

        computer computer2 = computerFactory.getComputer("desktop");
        computer2.showDetails();

        computer computer3 = computerFactory.getComputer("micro");
        computer3.showDetails();

    }

}
