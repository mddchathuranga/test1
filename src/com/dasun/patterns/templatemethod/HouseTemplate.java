package com.dasun.patterns.templatemethod;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("house build successfully done! ...");
    }

    private void buildWindows() {
        System.out.println("building windows using glasses..");

    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("building foundation using cement,iron,rods and sand...");

    }

}
