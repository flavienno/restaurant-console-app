package dev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.entite.Plat;

@Repository

public class PlatDaoJpa implements IPlatDao {

	// injecter une instance d'EntityManager  
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Plat> listerPlats() {
		List<Plat> plats = em.createQuery("SELECT p FROM Plat p", Plat.class ).getResultList();
		return plats;
	}

	@Override
	@Transactional
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		Plat plat = new Plat();
		plat.setNom(nomPlat);
		plat.setPrixEnCentimesEuros(prixPlat);
		this.em.persist(plat);

	}

}
