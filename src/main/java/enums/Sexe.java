package enums;

public enum Sexe {

	M("Male"),
	F("Female");
	
	private String sexe;
	
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
	
	
}
