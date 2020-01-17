package dev.entite;

import java.util.Objects;

public class Plat {

	private Integer id;
    private String nom;
    private Integer prixEnCentimesEuros;

    public Plat() {
    }

    /**
	 * @param id
	 * @param nom
	 * @param prixEnCentimesEuros
	 */
	public Plat(Integer id, String nom, Integer prixEnCentimesEuros) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixEnCentimesEuros = prixEnCentimesEuros;
	}

	public Plat(String nom, Integer prixEnCentimesEuros) {
        this.nom = nom;
        this.prixEnCentimesEuros = prixEnCentimesEuros;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPrixEnCentimesEuros() {
        return prixEnCentimesEuros;
    }

    public void setPrixEnCentimesEuros(Integer prixEnCentimesEuros) {
        this.prixEnCentimesEuros = prixEnCentimesEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plat plat = (Plat) o;
        return nom.equals(plat.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
