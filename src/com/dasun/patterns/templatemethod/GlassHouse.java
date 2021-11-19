package com.dasun.patterns.templatemethod;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("walls building by glass plates..");
    }

    @Override
    public void buildPillars() {
        System.out.println("pillars with glass coating ...");
    }
}
