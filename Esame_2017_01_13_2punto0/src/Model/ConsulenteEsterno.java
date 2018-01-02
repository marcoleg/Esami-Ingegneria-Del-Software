package Model;

import Controller.VisitorPersona;

public class ConsulenteEsterno extends Persona{

	public ConsulenteEsterno(String nome, String cognome, String email) {
		super(nome, cognome, email);
	}

	
	@Override
	public void visitaPersona(VisitorPersona visitorPersona) {
		visitorPersona.eseguiOperazioneSuPersona(this);
	}

}
