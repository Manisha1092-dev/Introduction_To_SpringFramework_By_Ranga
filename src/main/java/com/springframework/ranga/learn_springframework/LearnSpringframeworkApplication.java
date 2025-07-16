package com.springframework.ranga.learn_springframework;

import com.springframework.ranga.learn_springframework.game.GameRunner;
import com.springframework.ranga.learn_springframework.game.MarioGame;
import com.springframework.ranga.learn_springframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringframeworkApplication {

	public static void main(String[] args) {

		/***
		 *
		 * Tightly coupled coding issue -
		 * Had to change the code in all the files (Main and Runner class) inorder to run another game.
		 */

		//MarioGame marioGame = new MarioGame();
		SuperContraGame game = new SuperContraGame();
		//GameRunner runner = new GameRunner(marioGame);
		GameRunner runner = new GameRunner(game);
		runner.run();

	}
}
