package com.dasun.patterns.factory;

public class computerFactory {
    public computer getComputer(String computerType){
        if (computerType==null){
            return null;
        }
        else if (computerType.equalsIgnoreCase("desktop")){
            return new desktop();
        }
        else if (computerType.equalsIgnoreCase("laptop")){
            return new laptop();
        }
        else if (computerType.equalsIgnoreCase("micro")){
            return new micro();
        }
        return null;
    }
}
