package Model;

import java.util.ArrayList;

public class Team {

	private ArrayList<Persona> listaPersone;

	public Team() {
		this.listaPersone = new ArrayList<Persona>();
	}
	
	public void aggiungiPersona(Persona persona) {
		listaPersone.add(persona);
	}
	
}
