package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_EQUIPE")
	private Integer id;
	
	@Column(name="NOM_EQUIPE", length = 100, nullable = false, unique = false)
	private String nomEquipe;
	
	@ManyToMany(mappedBy = "pays")
	private List<Pays> pays = new ArrayList<Pays>();
	
	@ManyToMany(mappedBy = "pays")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	
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
