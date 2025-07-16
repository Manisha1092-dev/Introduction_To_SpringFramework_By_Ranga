package com.springframework.ranga.learn_springframework.game;

public class GameRunner {
    private MarioGame game;
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }


    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
