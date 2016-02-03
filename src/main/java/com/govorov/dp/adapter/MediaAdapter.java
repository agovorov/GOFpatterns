package com.govorov.dp.adapter;

/**
 * @author Govorov Andrey
 */
public class MediaAdapter {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audiType) {
        if (audiType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audiType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audiType, String fileName) {
        if (audiType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audiType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
