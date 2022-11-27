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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ATHLETE")
	private Integer id;
	
	@Column(name="NOM", length = 100, nullable = false, unique = false)
	private String nom;
	
	@Column(name="SEXE", nullable = true, unique = false)
	private String prenom;
	
	@Column(name="AGE", nullable = true, unique = false)
	private int age;
	
	@Column(name="TAILLE", nullable = true, unique = false)
	private int taille;
	
	@Column(name="POIDS", nullable = true, unique = false)
	private int poids;
	
	@Column(name="SEXE", nullable = false, unique = false)
	@Enumerated(EnumType.STRING)
	private Sexe sexe;
	
	
	@ManyToMany(mappedBy = "Athlete")
	private List<Jeux> jeux = new ArrayList<Jeux>();
	
	@ManyToMany(mappedBy = "Athlete")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	@ManyToOne
	@JoinColumn(name="ID_PAYS")
	private Pays pays;

	@OneToMany
	private List<Medaille> medaille = new ArrayList<Medaille>();
	
	
	public Athlete(String nom, String prenom, int age, int taille, int poids, Sexe sexe) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.taille=taille;
		this.poids=poids;
		this.setSexe(sexe);
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


	/** Getter pour prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/** Setter pour prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	
	
}
