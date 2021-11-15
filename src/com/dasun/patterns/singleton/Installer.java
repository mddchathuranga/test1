package com.dasun.patterns.singleton;

public class Installer {

    private static Installer instance;

    private Installer(){

    }
    public static Installer getInstant(){
        if (instance==null){
            instance=new Installer();
        }
        return instance;
    }

}
