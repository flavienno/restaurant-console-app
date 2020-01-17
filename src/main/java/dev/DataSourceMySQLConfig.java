package dev;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration

public class DataSourceMySQLConfig {

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");

		// TODO mettre à jour les informations de connexion à la base de données
		dataSource.setUrl("jdbc:mariadb://localhost:3306/restaurant-bdd");
		dataSource.setUsername("root");
		dataSource.setPassword("");

		return dataSource;
	}
}
