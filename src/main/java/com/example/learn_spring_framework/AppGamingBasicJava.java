package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var marioGame = new MarioGame();
		var supercontra = new SuperContraGame();
		//var gameRunner = new GameRunner(supercontra);
		var gameRunner = new GameRunner(supercontra);
		gameRunner.run();
		

	}

}
