package com.example.learn_spring_framework.game;

public class GameRunner {

	//private MarioGame game;
	//private SuperContraGame game;
	private GamingConsole game;
	

//	public GameRunner(MarioGame game) {
//		// TODO Auto-generated constructor stub
//		this.game = game;
//		
//	}
	
	/*
	 * public GameRunner(SuperContraGame game) { // TODO Auto-generated constructor
	 * stub this.game = game;
	 * 
	 * }
	 */
	
	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
		
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " +game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
