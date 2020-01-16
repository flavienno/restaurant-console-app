package dev;

import dev.config.AppConfig;
import dev.dao.PlatDaoFichier;
import dev.dao.PlatDaoMemoire;
import dev.ihm.Menu;
import dev.service.PlatServiceVersion1;
import dev.service.PlatServiceVersion2;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		 // Création du contexte Spring à partir d'une configuration Java 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// récupération du bean Menu  
		Menu menu = context.getBean(Menu.class);
		menu.afficher();
		
		// fermeture du Scanner  
		context.getBean(Scanner.class).close();
		
		// fermeture du contexte Spring  
		context.close();

	}
}
