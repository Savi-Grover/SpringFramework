package gamePackage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

	@SuppressWarnings("preview")
	record Person (String name, int age) {
		
	};
	
	@SuppressWarnings("preview")
	record Address (String firstline, String city) {
		
	};
@Configuration
public class helloWorld_Configuration {
	
	@Bean
	public String name() {
		return "savi";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("ABC",20);
		
	}
	
	@Primary
	@Bean(name="address2")
	public Address address2() {
		return new Address("Baker St","London");
		
	}
	@Qualifier("address3Qualifier")
	@Bean(name="exampleAddress2")
	public Address address() {
		return new Address("Baker St","London");
		
	}
	
}
