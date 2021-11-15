package com.dasun.patterns.adapter;

public class AllMediaPlayer implements ProMediaPlayer {

    @Override
    public void playAll(String fileName) {

        System.out.println("Playing" + fileName + " on All Media Player");
    }


    @Override
    public void playIn4k(String fileName) {

    }
}
