package com.springframework.ranga.learn_springframework;

import com.springframework.ranga.learn_springframework.game.GameRunner;
import com.springframework.ranga.learn_springframework.game.Games;
import com.springframework.ranga.learn_springframework.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringframeworkApplication {

    public static void main(String[] args) {

        /***
         *
         * Tightly coupled coding issue -
         * Had to change the code in all the files (Main and Runner class) inorder to run another game.
         *
         * To reduce tight coupling we introduced interface Game.
         * Now we not need to change GameRunner class everytime we need to play another game.
         * We only need to create different object of Game based on what game we want to play.
         *
         */

        //Games game = new MarioGame();
        Games game = new SuperContraGame();
        GameRunner runner = new GameRunner(game);
        runner.run();

    }
}
