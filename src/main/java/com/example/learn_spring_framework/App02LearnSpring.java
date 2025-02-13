package com.example.learn_spring_framework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.Pacman;
import com.example.learn_spring_framework.game.SuperContraGame;

public class App02LearnSpring {

	public static void main(String[] args) {
		//1. we need to launch a  spring context
		var context= 
				new AnnotationConfigApplicationContext(helloWorldConfiguration.class);
		
		//2. configure things we want spring to manage - 
		//by hello world configrator class @configuration class
		//name - @Bean
		
		//3. retreive beans managed by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("exampleAddress2"));
		
		//similar matching bean - error
		//System.out.println(context.getBean("Address.class"));
		
		//how to list all beans managed by sf - 
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
