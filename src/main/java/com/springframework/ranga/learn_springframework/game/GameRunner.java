package com.springframework.ranga.learn_springframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private Games game;

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
