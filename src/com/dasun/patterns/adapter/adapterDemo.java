package com.dasun.patterns.adapter;

public class adapterDemo {
    public static void main(String[] args) {

        audioPlayer audioPlayer = new audioPlayer();
        audioPlayer.play("heal the world", "mp3");
        audioPlayer.play("titanic", "MP4");
        audioPlayer.play("Money heist", "4K");

    }
}
