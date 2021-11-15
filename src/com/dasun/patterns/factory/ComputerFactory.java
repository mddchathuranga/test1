package com.dasun.patterns.factory;

public class ComputerFactory {
    public Computer getComputer(String computerType) {
        if (computerType == null) {
            return null;
        } else if (computerType.equalsIgnoreCase("desktop")) {
            return new Desktop();
        } else if (computerType.equalsIgnoreCase("laptop")) {
            return new Laptop();
        } else if (computerType.equalsIgnoreCase("micro")) {
            return new Micro();
        }
        return null;
    }
}
