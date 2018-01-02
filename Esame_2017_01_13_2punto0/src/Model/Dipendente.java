package Model;

import Controller.VisitorPersona;

public class Dipendente extends Persona{
	
	public Dipendente(String nome, String cognome, String email) {
		super(nome, cognome, email);
	}

	
	@Override
	public void visitaPersona(VisitorPersona visitorPersona) {
		visitorPersona.eseguiOperazioneSuPersona(this);	
	}
	
	
}
