package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private Music music;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}
