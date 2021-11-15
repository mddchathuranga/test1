package com.dasun.patterns.singleton;

public class SoftwareManager {

    public static void main(String[] args) {
        Installer software1 = Installer.getInstant();
        Installer software2 = Installer.getInstant();
        System.out.println(software1.hashCode());
        System.out.println(software2.hashCode());
    }

}
