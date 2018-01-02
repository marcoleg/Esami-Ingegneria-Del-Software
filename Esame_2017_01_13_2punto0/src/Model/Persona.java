package Model;

import Controller.VisitorPersona;

public abstract class Persona {

	private String nome;
	private String cognome;
	private String email;
	
	public Persona(String nome, String cognome, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	
	public abstract void visitaPersona(VisitorPersona visitorPersona);
}
