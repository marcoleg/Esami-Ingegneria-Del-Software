package Controller;

import java.util.ArrayList;

import Model.Pasto;
import Model.Persona;
import Model.Team;
import Model.TesseraMensa;

public class Mensa {
	
	private ArrayList<Team> listaTeam;
	private ArrayList<Persona> listaPersone;
	private ArrayList<TesseraMensa> listaTessereMensa;
	
	public Mensa() {
		listaTeam = new ArrayList<Team>();
		listaPersone = new ArrayList<Persona>();
		listaTessereMensa = new ArrayList<TesseraMensa>();
	}
	
	public void aggiungiPersona(Persona persona){
		this.listaPersone.add(persona);
	}
	
	public void aggiungiTeam(Team team) {
		this.listaTeam.add(team);
	}
	
	public void aggiungiTessera(TesseraMensa tesseraMensa) {
		this.listaTessereMensa.add(tesseraMensa);
	}
	
	//
	public void aggiungiPasto(Pasto pasto, Persona persona) {
		for (TesseraMensa tesseraMensa : this.listaTessereMensa) {
			if(tesseraMensa.getPersona() == persona)
				tesseraMensa.aggiungiPasto(pasto);
		}
	}
}
