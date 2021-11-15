package com.dasun.patterns.factory;

public class Desktop implements Computer {
    @Override
    public void showDetails() {
        System.out.println("This is a Desktop Computer");
    }
}
