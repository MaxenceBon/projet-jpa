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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import enums.Medaille;
import enums.Sexe;

public class Athlete{

	
	/** Classe Athlete
	 * @column id
	 * @column nom
	 * @column prenom
	 * @column age
	 * @column taille
	 * @column poids
	 * @column sexe enum
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="NOM", length = 100, nullable = false, unique = false)
	private String nom;
	
	@Column(name="AGE", nullable = true, unique = false)
	private int age;
	
	@Column(name="TAILLE", nullable = true, unique = false)
	private int taille;
	
	@Column(name="POIDS", nullable = true, unique = false)
	private int poids;
	
	@Column(name="SEXE", nullable = false, unique = false)
	@Enumerated(EnumType.STRING)
	private Sexe sexe;
	
	
	/**Relation many to many
	 * entre Athlete et Jeux
	 */
	@ManyToMany(mappedBy = "Athlete")
	private List<Jeux> jeux = new ArrayList<Jeux>();
	
	
	/**Relation many to many
	 * entre Athlete et Epreuve
	 */
	@ManyToMany(mappedBy = "Athlete")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	
	/**Relation many to many - Table d'association
	 * entre Epreuve et Jeux
	 */
	@ManyToOne
	@JoinColumn(name="ID_PAYS")
	private Pays pays;

	
	/**Relation one to many
	 * entre Athlete et Medaille
	 */
	@OneToMany (mappedBy = "athelete")
	private List<Medaille> medailles = new ArrayList<Medaille>();
	
	
	/** Constructor
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param taille
	 * @param poids
	 * @param sexe
	 */
	public Athlete(String nom, int age, int taille, int poids, Sexe sexe) {
		this.nom=nom;
		this.age=age;
		this.taille=taille;
		this.poids=poids;
		this.setSexe(sexe);
	}

	public Athlete() {
		
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


	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getter pour age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/** Setter pour age
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/** Getter pour taille
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}


	/** Setter pour taille
	 * @param taille the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}


	/** Getter pour poids
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}


	/** Setter pour poids
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}


	/** Getter pour sexe
	 * @return the sexe
	 */
	public Sexe getSexe() {
		return sexe;
	}


	/** Setter pour sexe
	 * @param sexe the sexe to set
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
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


	/** Getter pour pays
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}


	/** Setter pour pays
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
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
