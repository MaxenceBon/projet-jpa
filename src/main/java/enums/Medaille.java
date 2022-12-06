package enums;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entities.Athlete;
import entities.Epreuve;

public enum Medaille {

	/** Enumération pour les trois types de médailles
	 * Bronze, Silver et Gold
	 */
	BRONZE("Bronze"),
	SILVER("Silver"),
	GOLD("Gold");
	
	
	/**
	 * @param String medaille
	 */	
	private String medaille;
	
	
	
	/**Relation many to one
	 * entre Medaille et Athlete
	 */
	@ManyToOne
	@JoinColumn(name="ID_ATHLETE")
	private Athlete athlete;
	
	
	/**Relation many to one
	 * entre Medaille et Epreuve
	 */
	@ManyToOne
	@JoinColumn(name="ID_EPREUVE")
	private Epreuve epreuve;
	
	private Medaille(String medaille) {
		this.medaille=medaille;
	}

	/** Getter pour medaille
	 * @return the medaille
	 */
	public String getMedaille() {
		return medaille;
	}

	/** Setter pour medaille
	 * @param medal the medaille to set
	 */
	public void setMedal(String medaille) {
		this.medaille = medaille;
	}
	
	
	
}
