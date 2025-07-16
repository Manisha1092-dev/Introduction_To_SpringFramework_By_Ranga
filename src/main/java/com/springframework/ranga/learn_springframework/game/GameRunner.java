package com.springframework.ranga.learn_springframework.game;

public class GameRunner {
   // private MarioGame game;
    private SuperContraGame game;

    /*
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }
    */
    /*
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }
    */

    public GameRunner(SuperContraGame superContraGame) {
        this.game = superContraGame;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
