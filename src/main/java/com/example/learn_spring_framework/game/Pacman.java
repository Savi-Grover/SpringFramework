package com.example.learn_spring_framework.game;

public class Pacman implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("moving up and bite");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("moving down and bite");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("turn left and bite");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("turn right and bite");
	}

}
