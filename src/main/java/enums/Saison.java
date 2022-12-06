package enums;

public enum Saison {

	
	/** Enumération pour les deux types de saisons
	 * Summer et Winter
	 */
	SUMMER("Summer"),
	WINTER("Winter");
	
	
	/**
	 * @param String saison
	 */
	private String saison;
	
	
	
	/** Constructor
	 * @param saison
	 */
	private Saison(String saison) {
		this.saison=saison;
	}

	/** Getter pour saison
	 * @return the saison
	 */
	public String getSaison() {
		return saison;
	}

	/** Setter pour saison
	 * @param season the saison to set
	 */
	public void setSaison(String saison) {
		this.saison = saison;
	}
	
	
	
}
