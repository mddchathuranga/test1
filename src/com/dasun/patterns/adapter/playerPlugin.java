package com.dasun.patterns.adapter;

public class playerPlugin implements freeMediaPlayer {

    proMediaPlayer proMediaPlayer;

    public playerPlugin(String fileType) {
        if (fileType.equalsIgnoreCase("MP4")) {
            proMediaPlayer = new allMediaPlayer();
        } else if (fileType.equalsIgnoreCase("4K")) {
            proMediaPlayer = new hqMediaPlayer();
        }
    }

    @Override
    public void play(String fileName, String fileType) {

        if (fileType.equalsIgnoreCase("MP4")) {
            proMediaPlayer.playAll(fileName);
        } else if (fileType.equalsIgnoreCase("4K")) {
            proMediaPlayer.playIn4k(fileName);
        }

    }


}
