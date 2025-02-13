package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.Pacman;
import com.example.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obj of individual game class
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game= new Pacman();
		
		//for running game runner
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		

	}

}
