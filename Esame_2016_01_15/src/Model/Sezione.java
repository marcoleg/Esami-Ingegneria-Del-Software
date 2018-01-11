package Model;

import java.util.ArrayList;

import Controller.Calcolo;

public abstract class Sezione {

	protected String nome;

	
	public Sezione(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}
	
	public abstract ArrayList<Sezione> getFigli();
	public abstract void aggiungiFiglio(Sezione sezione);
	public abstract void aggiungiLibroAFoglia(Libro libro);
	public abstract ArrayList<Libro> getListaLibri();
	public abstract int calcola(Calcolo calcolo);
	public abstract boolean isRadice();
}
