package enums;

public enum Distinction {

	MEN("Men"),
	WOMEN("Women"),
	MIXED("Mixed");
	
	private String distinction;
	
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
