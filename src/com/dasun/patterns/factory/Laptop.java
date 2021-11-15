package com.dasun.patterns.factory;

public class Laptop implements Computer {
    @Override
    public void showDetails() {
        System.out.println("This is Laptop Computer");
    }
}
