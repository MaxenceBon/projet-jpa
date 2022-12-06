package enums;

public enum Distinction {
	
	
	/** Enumération pour les trois types d'épreuves
	 * Men, Women et Mixed
	 */
	MEN("Men"),
	WOMEN("Women"),
	MIXED("Mixed");
	
	/**
	 * @param String distinction
	 */	
	private String distinction;
	
	/** Constructor
	 * @param distinction
	 */
	private Distinction(String distinction) {
		this.distinction=distinction;
	}

	/** Getter pour distinction
	 * @return the distinction
	 */
	public String getDistinction() {
		return distinction;
	}

	/** Setter pour distinction
	 * @param distinction the distinction to set
	 */
	public void setDistinction(String distinction) {
		this.distinction = distinction;
	}
	
	
	
}
