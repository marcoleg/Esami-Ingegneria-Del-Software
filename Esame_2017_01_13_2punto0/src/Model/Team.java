package Model;

import java.util.ArrayList;

public class Team {

	private ArrayList<Persona> personeNelTeam;

	public Team() {
		
		this.personeNelTeam = new ArrayList<Persona>();
		
	}
	
	public ArrayList<Persona> getPersoneNelTeam() {
		
		return this.personeNelTeam;
		
	}
	
	public void aggiungiPersonaNelTeam(Persona persona) {
		
		this.personeNelTeam.add(persona);
		
	}
	
	
	
}
