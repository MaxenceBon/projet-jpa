package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


public class Sport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_SPORT")
	private Integer id;
	
	@Column(name="Libelle", length = 100, nullable = false, unique = true)
	private String libelle;
	
	@OneToMany (mappedBy = "sport")
	private List<Epreuve> emprunts = new ArrayList<Epreuve>();
	
	public Sport(String libelle) {
		
	}
	
}
