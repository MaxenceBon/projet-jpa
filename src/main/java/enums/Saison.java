package enums;

public enum Saison {

	SUMMER("Summer"),
	WINTER("Winter");
	
	private String season;
	
	private Saison(String season) {
		this.season=season;
	}

	/** Getter pour season
	 * @return the season
	 */
	public String getSeason() {
		return season;
	}

	/** Setter pour season
	 * @param season the season to set
	 */
	public void setSeason(String season) {
		this.season = season;
	}
	
	
	
}
