package Model;

import Controller.OperazioneSuPersona;

public class Consulente extends Persona {

	public Consulente(String nome, String cognome, String email) {
		super(nome, cognome, email);
	}

	@Override
	public void visitTipo(OperazioneSuPersona operazioneSuPersona) {
		operazioneSuPersona.esegui(this);
	}
	
}
