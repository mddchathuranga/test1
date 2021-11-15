package com.dasun.patterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("heal the world", "mp3");
        audioPlayer.play("titanic", "MP4");
        audioPlayer.play("Money heist", "4K");

    }
}
