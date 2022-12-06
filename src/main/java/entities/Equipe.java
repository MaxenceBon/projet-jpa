package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Equipe {

	
	/** Classe Athlete
	 * @column id
	 * @column nomEquipe
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_EQUIPE")
	private Integer id;
	
	@Column(name="NOM_EQUIPE", length = 100, nullable = false, unique = false)
	private String nomEquipe;
	
	
	/**Relation many to many
	 * entre Equipe et Pays
	 */
	@ManyToMany(mappedBy = "pays")
	private List<Pays> pays = new ArrayList<Pays>();
	
	
	/**Relation many to many
	 * entre Equipe et Epreuve
	 */
	@ManyToMany(mappedBy = "pays")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	
	/** Constructor
	 * @param nomEquipe
	 */
	public Equipe(String nomEquipe) {
		this.nomEquipe=nomEquipe;
	}


	/** Getter pour nomEquipe
	 * @return the nomEquipe
	 */
	public String getNomEquipe() {
		return nomEquipe;
	}


	/** Setter pour nomEquipe
	 * @param nomEquipe the nomEquipe to set
	 */
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	
	
	
}
