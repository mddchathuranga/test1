package com.dasun.patterns.adapter;

public class PlayerPlugin implements FreeMediaPlayer {

    ProMediaPlayer proMediaPlayer;

    public PlayerPlugin(String fileType) {
        if (fileType.equalsIgnoreCase("MP4")) {
            proMediaPlayer = new AllMediaPlayer();
        } else if (fileType.equalsIgnoreCase("4K")) {
            proMediaPlayer = new HqMediaPlayer();
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
