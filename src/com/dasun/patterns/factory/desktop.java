package com.dasun.patterns.factory;

public class desktop implements computer {
    @Override
    public void showDetails() {
        System.out.println("This is a Desktop Computer");
    }
}
