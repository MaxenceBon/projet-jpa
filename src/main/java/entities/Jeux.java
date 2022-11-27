package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import enums.Saison;

public class Jeux {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_JEUX")
	private Integer id;
	
	@Column(name="ANNEE", length = 100, nullable = false, unique = false)
	private String annee;
	
	@Column(name="VILLE", nullable = false, unique = false)
	private String ville;
	
	@Column(name="SAISON", nullable = false, unique = false)
	@Enumerated(EnumType.STRING)
	private Saison saison;
	
	
	@ManyToMany(mappedBy = "jeux")
	@JoinTable(name = "ATHLETE_JEUX", 
				joinColumns = @JoinColumn(name= "ID_JEUX", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_ATHLETE", referencedColumnName = "ID"))
	private List<Athlete> atheletes = new ArrayList<Athlete>();
	
	@ManyToMany(mappedBy = "jeux")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	
	
	public Jeux(String annee, String ville, Saison saison) {
		this.annee=annee;
		this.ville=ville;
		this.setSaison(saison);
	}

	/** Getter pour id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter pour id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter pour annee
	 * @return the annee
	 */
	public String getAnnee() {
		return annee;
	}

	/** Setter pour annee
	 * @param annee the annee to set
	 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}

	/** Getter pour city
	 * @return the city
	 */
	public String getVille() {
		return ville;
	}

	/** Setter pour city
	 * @param city the city to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/** Getter pour saison
	 * @return the saison
	 */
	public Saison getSaison() {
		return saison;
	}

	/** Setter pour saison
	 * @param saison the saison to set
	 */
	public void setSaison(Saison saison) {
		this.saison = saison;
	}

	/** Getter pour emprunts
	 * @return the emprunts
	 */
	public List<Athlete> getEmprunts() {
		return atheletes;
	}

	/** Setter pour emprunts
	 * @param emprunts the emprunts to set
	 */
	public void setEmprunts(List<Athlete> emprunts) {
		this.atheletes = emprunts;
	}
	
	
	
}
