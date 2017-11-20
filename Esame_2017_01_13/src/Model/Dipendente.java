package Model;

import Controller.OperazioneSuPersona;

public class Dipendente extends Persona {

	public Dipendente(String nome, String cognome, String email) {
		super(nome, cognome, email);
	}

	@Override
	public void visitTipo(OperazioneSuPersona operazioneSuPersona) {
		operazioneSuPersona.esegui(this);
	}
	
}
