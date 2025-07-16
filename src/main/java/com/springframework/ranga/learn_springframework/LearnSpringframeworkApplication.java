package com.springframework.ranga.learn_springframework;

import com.springframework.ranga.learn_springframework.game.GameRunner;
import com.springframework.ranga.learn_springframework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringframeworkApplication {

	public static void main(String[] args) {

		MarioGame marioGame = new MarioGame();
		GameRunner runner = new GameRunner(marioGame);
		runner.run();

	}
}
