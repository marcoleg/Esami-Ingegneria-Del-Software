package Controller;

import Model.Consulente;
import Model.Dipendente;
import Model.Persona;
import Model.TesseraMensa;
import View.Stampa;

public class NotificaTipoDiPersona implements OperazioneSulContestoPasto, OperazioneSuPersona {

	@Override
	public void esegui(Consulente consulente) {
		Stampa.stampa("La persona " + consulente.getNome() + " " + consulente.getCognome() + " è un consulente.");
	}

	@Override
	public void esegui(Dipendente dipendente) {
		Stampa.stampa("La persona " + dipendente.getNome() + " " + dipendente.getCognome() + " è un dipendente.");
	}

	@Override
	public void esegui(TesseraMensa tesseraMensa) {
		Persona persona = tesseraMensa.getPersona();
		
		persona.visitTipo(this);
	}

}
