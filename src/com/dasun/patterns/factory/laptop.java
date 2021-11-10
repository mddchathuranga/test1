package com.dasun.patterns.factory;

public class laptop implements computer {
    @Override
    public void showDetails() {
        System.out.println("This is Laptop Computer");
    }
}
