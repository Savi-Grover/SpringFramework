package gamePackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.GamingConsole;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.Pacman;
import com.example.learn_spring_framework.game.SuperContraGame;

public class AppBasic_SpringBeans {

	public static void main(String[] args) {
		
		try(var context=
				new AnnotationConfigApplicationContext(Gaming_Configurations.class);
				){
			
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();

		}
		
		
	}

}
