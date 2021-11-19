package com.dasun.patterns.templatemethod;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("walls building by wood plates..");
    }

    @Override
    public void buildPillars() {
        System.out.println("pillars building by wood...");
    }
}
