package enums;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entities.Athlete;
import entities.Epreuve;

public enum Medaille {

	BRONZE("Bronze"),
	SILVER("Silver"),
	GOLD("Gold");
	
	private String medal;
	
	@ManyToOne
	@JoinColumn(name="ID_ATHLETE")
	private Athlete athlete;
	
	@ManyToOne
	@JoinColumn(name="ID_EPREUVE")
	private Epreuve epreuve;
	
	private Medaille(String medal) {
		this.medal=medal;
	}

	/** Getter pour medal
	 * @return the medal
	 */
	public String getMedal() {
		return medal;
	}

	/** Setter pour medal
	 * @param medal the medal to set
	 */
	public void setMedal(String medal) {
		this.medal = medal;
	}
	
	
	
}
