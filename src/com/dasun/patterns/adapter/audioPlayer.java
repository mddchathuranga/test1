package com.dasun.patterns.adapter;

public class audioPlayer implements freeMediaPlayer{
    playerPlugin playerPlugin;

    @Override
    public void play(String fileName, String fileType) {

        if (fileType.equalsIgnoreCase("mp3")){

            System.out.println("Playing"+fileName+" on Audio Player");

        }
        else if((fileType.equalsIgnoreCase("MP4"))||(fileType.equalsIgnoreCase("4K"))){
            playerPlugin=new playerPlugin(fileType);
            playerPlugin.play(fileName,fileType);
        }
        else {
            System.out.println("invalid file type!");
        }

    }
}
