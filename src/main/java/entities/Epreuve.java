package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import enums.Distinction;
import enums.Medaille;

public class Epreuve {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_EPREUVE")
	private Integer id;
	
	@Column(name="NOM_EPREUVE", length = 100, nullable = false, unique = false)
	private String nomEpreuve;
	
	@Column(name="DISTINCTION", nullable = false, unique = false)
	private Distinction distinction;
	
	@ManyToMany(mappedBy = "epreuve")
	@JoinTable(name = "JEUX_EPREUVE", 
				joinColumns = @JoinColumn(name= "ID_EPREUVE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_JEUX", referencedColumnName = "ID"))
	private List<Jeux> jeux = new ArrayList<Jeux>();
	
	@ManyToMany(mappedBy = "epreuve")
	@JoinTable(name = "EQUIPE_EPREUVE", 
				joinColumns = @JoinColumn(name= "ID_EPREUVE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_EQUIPE", referencedColumnName = "ID"))
	private List<Equipe> equipes = new ArrayList<Equipe>();
	
	
	@OneToMany
	private List<Medaille> medaille = new ArrayList<Medaille>();

	@ManyToOne
	@JoinColumn(name="ID_SPORT")
	private Sport sport;
	
	
	public Epreuve(String nomEpreuve, Distinction distinction) {
		this.nomEpreuve=nomEpreuve;
		this.setDistinction(distinction);
	}

	/** Getter pour nomEpreuve
	 * @return the nomEpreuve
	 */
	public String getNomEpreuve() {
		return nomEpreuve;
	}

	/** Setter pour nomEpreuve
	 * @param nomEpreuve the nomEpreuve to set
	 */
	public void setNomEpreuve(String nomEpreuve) {
		this.nomEpreuve = nomEpreuve;
	}

	/** Getter pour distinction
	 * @return the distinction
	 */
	public Distinction getDistinction() {
		return distinction;
	}

	/** Setter pour distinction
	 * @param distinction the distinction to set
	 */
	public void setDistinction(Distinction distinction) {
		this.distinction = distinction;
	}

	
	
}
