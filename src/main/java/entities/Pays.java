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
import javax.persistence.OneToMany;

public class Pays {

	
	/** Classe Athlete
	 * @column id
	 * @column nomPays
	 * @column obselete
	 * @column codeCio
	 * @column codeIso
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="NOM_PAYS", length = 100, nullable = false, unique = false)
	private String nomPays;
	
	@Column(name="OBSELETE", nullable = false, unique = false)
	private boolean obselete;
	
	@Column(name="CODE_CIO", nullable = false, unique = true)
	private String codeCio;
	
	@Column(name="CODE_ISO", nullable = true, unique = true)
	private int codeIso;

	
	/**Relation one to many
	 * entre Pays et Athlete
	 */
	@OneToMany(mappedBy = "pays")
	private List<Athlete> athletes = new ArrayList<Athlete>();
	
	
	/**Relation many to many - Table d'association
	 * entre Pays et Equipe
	 */
	@ManyToMany(mappedBy = "pays")
	@JoinTable(name = "PAYS_EQUIPE", 
				joinColumns = @JoinColumn(name= "ID_PAYS", referencedColumnName = "ID"),
				inverseJoinColumns = @JoinColumn(name = "ID_EQUIPE", referencedColumnName = "ID"))
	private List<Equipe> equipes = new ArrayList<Equipe>();
	
	
	
	/** Constructor
	 * @param nomPays
	 * @param obselete
	 * @param codeCio
	 * @param codeIso
	 */
	public Pays(String nomPays, boolean obselete, String codeCio, int codeIso) {
		this.nomPays=nomPays;
		this.obselete=obselete;
		this.codeCio=codeCio;
		this.codeIso=codeIso;
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

	/** Getter pour nomPays
	 * @return the nomPays
	 */
	public String getNomPays() {
		return nomPays;
	}

	/** Setter pour nomPays
	 * @param nom the nomPays to set
	 */
	public void setNom(String nomPays) {
		this.nomPays = nomPays;
	}

	/** Getter pour obselete
	 * @return the obselete
	 */
	public boolean isObselete() {
		return obselete;
	}

	/** Setter pour obselete
	 * @param obselete the obselete to set
	 */
	public void setObselete(boolean obselete) {
		this.obselete = obselete;
	}

	/** Getter pour codeCio
	 * @return the codeCio
	 */
	public String getCodeCio() {
		return codeCio;
	}

	/** Setter pour codeCio
	 * @param codeCio the codeCio to set
	 */
	public void setCodeCio(String codeCio) {
		this.codeCio = codeCio;
	}

	/** Getter pour codeIso
	 * @return the codeIso
	 */
	public int getCodeIso() {
		return codeIso;
	}

	/** Setter pour codeIso
	 * @param codeIso the codeIso to set
	 */
	public void setCodeIso(int codeIso) {
		this.codeIso = codeIso;
	}

	/** Getter pour athletes
	 * @return the athletes
	 */
	public List<Athlete> getAthletes() {
		return athletes;
	}

	/** Setter pour athletes
	 * @param athletes the athletes to set
	 */
	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
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
	
	
	
}
