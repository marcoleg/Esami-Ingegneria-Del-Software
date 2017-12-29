package Controller;

import java.util.ArrayList;

import Model.Persona;
import Model.TesseraMensa;

public class Mensa {

	private ArrayList<Persona> listaPersone;
	private ArrayList<TesseraMensa> listaTessereMensa;
	private String nomeMensa;
	
	public Mensa(String nomeMensa) {
		
		this.listaPersone = new ArrayList<Persona>();
		this.listaTessereMensa = new ArrayList<TesseraMensa>();
		this.nomeMensa = nomeMensa;
		
	}
	
	public void aggiungiPersona(Persona persona) {
		
		this.listaPersone.add(persona);
		
	}
	
	public void aggiungiTessera(TesseraMensa tesseraMensa) {
		
		this.listaTessereMensa.add(tesseraMensa);
		
	}
}