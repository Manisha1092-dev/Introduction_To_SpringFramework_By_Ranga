package com.springframework.ranga.learn_springframework.game;

public class GameRunner {

    private Games game;

    public GameRunner(Games game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
