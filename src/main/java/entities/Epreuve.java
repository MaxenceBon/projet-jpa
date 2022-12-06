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

	
	/** Classe Athlete
	 * @column id
	 * @column nomEpreuve
	 * @column distinction
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_EPREUVE")
	private Integer id;
	
	@Column(name="NOM_EPREUVE", length = 100, nullable = false, unique = false)
	private String nomEpreuve;
	
	@Column(name="DISTINCTION", nullable = false, unique = false)
	private Distinction distinction;
	
	
	/**Relation many to many - Table d'association
	 * entre Epreuve et Jeux
	 */
	@ManyToMany(mappedBy = "epreuve")
	@JoinTable(name = "JEUX_EPREUVE", 
				joinColumns = @JoinColumn(name= "ID_EPREUVE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_JEUX", referencedColumnName = "ID"))
	private List<Jeux> jeux = new ArrayList<Jeux>();
	
	
	/**Relation many to many - Table d'association
	 * entre Epreuve et Equipe
	 */
	@ManyToMany(mappedBy = "epreuve")
	@JoinTable(name = "EQUIPE_EPREUVE", 
				joinColumns = @JoinColumn(name= "ID_EPREUVE", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_EQUIPE", referencedColumnName = "ID"))
	private List<Equipe> equipes = new ArrayList<Equipe>();
	
	
	/**Relation one to many
	 * entre Epreuve et Medaille
	 */
	@OneToMany
	private List<Medaille> medailles = new ArrayList<Medaille>();

	
	/**Relation many to one
	 * entre Epreuve et Sport
	 */
	@ManyToOne
	@JoinColumn(name="ID_SPORT")
	private Sport sport;
	
	
	/** Constructor
	 * @param nomEpreuve
	 * @param distinction
	 */
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

	/** Getter pour jeux
	 * @return the jeux
	 */
	public List<Jeux> getJeux() {
		return jeux;
	}

	/** Setter pour jeux
	 * @param jeux the jeux to set
	 */
	public void setJeux(List<Jeux> jeux) {
		this.jeux = jeux;
	}

	/** Getter pour equipes
	 * @return the equipes
	 */
	public List<Equipe> getEquipes() {
		return equipes;
	}

	/** Setter pour equipes
	 * @param equipes the equipes to set
	 */
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	/** Getter pour medailles
	 * @return the medailles
	 */
	public List<Medaille> getMedailles() {
		return medailles;
	}

	/** Setter pour medailles
	 * @param medailles the medailles to set
	 */
	public void setMedailles(List<Medaille> medailles) {
		this.medailles = medailles;
	}

	
	
}
