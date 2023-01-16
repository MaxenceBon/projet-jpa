package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


public class Sport {

	/** Classe Athlete
	 * @column id
	 * @column libelle
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="Libelle", length = 100, nullable = false, unique = true)
	private String libelle;
	
	
	/**Relation one to many
	 * entre Sport et Epreuve
	 */
	@OneToMany (mappedBy = "sport")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	
	/** Constructor
	 * @param libelle
	 */
	public Sport(String libelle) {
		this.libelle=libelle;
	}


	/** Getter pour libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/** Setter pour libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	/** Getter pour epreuves
	 * @return the epreuves
	 */
	public List<Epreuve> getEpreuves() {
		return epreuves;
	}


	/** Setter pour epreuves
	 * @param epreuves the epreuves to set
	 */
	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}
	
	
	
}
