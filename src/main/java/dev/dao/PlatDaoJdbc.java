package dev.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dev.entite.Plat;

@Repository
public class PlatDaoJdbc implements IPlatDao {

	// outil JdbcTemplate fourni par Spring JDBC  
	private JdbcTemplate jdbcTemplate;

	@Autowired // injection de la source de données
	public PlatDaoJdbc(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public List<Plat> listerPlats() {
		String sql = "SELECT * FROM PLAT";
		List<Plat> plats = jdbcTemplate.query(sql, new PlatMapper());

		return plats;
	}

	@Override
	public void ajouterPlat(String nomPlat, Integer prix) {
		String sql = "INSERT INTO plat (nom,prixEnCentimesEuros) VALUES(?,?)";
		jdbcTemplate.update(sql, nomPlat, prix);
	}

}
