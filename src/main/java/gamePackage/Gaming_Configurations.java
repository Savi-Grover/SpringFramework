package gamePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.GamingConsole;
import com.example.learn_spring_framework.game.Pacman;

@Configuration 
public class Gaming_Configurations {
	// TODO Auto-generated method stub
	
			//obj of individual game class
			//var game = new MarioGame();
			//var game = new SuperContraGame();
			//var game= new Pacman();
			
			//for running game runner
//			var gameRunner = new GameRunner(game);
//			gameRunner.run();
			
			@Bean
			public GamingConsole game() {
				var game = new Pacman();
				return game;
			}
			

			@Bean
			public GameRunner gameRunner(GamingConsole game) {
				var gameRunner = new GameRunner(game);
				return gameRunner;
			}
			
}
