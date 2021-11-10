package com.dasun.patterns.adapter;

public class hqMediaPlayer implements proMediaPlayer {
    @Override
    public void playAll(String fileName) {

    }

    @Override
    public void playIn4k(String fileName) {

        System.out.println("Playing" + fileName + " on HQ Media Player");

    }
}
