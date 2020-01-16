package dev.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Le stéréotype @Configuration précise que cette classe servira de configuration. 
@Configuration
@ComponentScan({ "dev.dao", "dev.service", "dev.ihm" })
@PropertySource("app.properties")

public class AppConfig {

	@Bean
	public Scanner Scanner(){
		return new Scanner(System.in);
	}

}
