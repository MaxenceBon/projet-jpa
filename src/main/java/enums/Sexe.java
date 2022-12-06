package enums;

public enum Sexe {
	
	/** Enumération pour les deux types de sexes
	 * Male et Female
	 */
	M("Male"),
	F("Female");
	
	
	/**
	 * @param String sexe
	 */	
	private String sexe;
	
	
	/** Constructor
	 * @param sexe
	 */
	private Sexe(String sexe) {
		this.sexe=sexe;
	}

	
	/** Getter pour sexe
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}

	/** Setter pour sexe
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public Sexe forName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
