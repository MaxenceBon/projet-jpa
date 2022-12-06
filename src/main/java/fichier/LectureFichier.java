package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import entities.Athlete;
import entities.Epreuve;
import entities.Equipe;
import entities.Jeux;
import entities.Pays;
import enums.Medaille;
import enums.Sexe;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Athlete> athletes = new ArrayList<Athlete>();
		List<Epreuve> epreuves = new ArrayList<Epreuve>();
		List<Jeux> jeux = new ArrayList<Jeux>();
		List<Equipe> equipes = new ArrayList<Equipe>();
		List<Medaille> medailles = new ArrayList<Medaille>();
		List<Pays> pays = new ArrayList<Pays>();
		
		Path pathAthletes = Paths.get("athlete_epreuves.csv");
		Path pathEpreuves = Paths.get("liste_des_epreuves.csv");
		Path pathSports = Paths.get("liste_des_sports.csv");
		Path pathPays = Paths.get("wikipedia-iso-country-codes.csv");
		
		
		List<String> lignes = Files.readAllLines(pathAthletes, StandardCharsets.UTF_8);
			for (int i = 1; i < lignes.size(); i++) {
				String[] tokenString = lignes.get(i).split(";");
				String nom = tokenString[1];
				int age = Integer.parseInt(tokenString[3]);
				int taille = Integer.parseInt(tokenString[5]);
				int poids = Integer.parseInt(tokenString[4]);
				String sexe = tokenString[2];
				
//				athletes.add(new Athlete(nom, age, taille, poids, sexe));
			}
	
		
	}

}
