package com.springframework.ranga.learn_springframework;

import com.springframework.ranga.learn_springframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

         /*

            //Games game = new MarioGame();
            Games game = new SuperContraGame();
            GameRunner runner = new GameRunner(game);
            runner.run();

         */

        /**
         *
         * With Spring framework, we don't need to change code.
         * It automatically scans the component and create beans and inject them wherever required.
         * whichever game we need to play we need to add @Component on that game class.
         * Multiple @Component class will create issue as compiler is unable to decide which bean to use as both, MarioGame and SuperContraGame are of same type that is Gaming Console.
         *
         */

        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringframeworkApplication.class, args);
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
    }
}
