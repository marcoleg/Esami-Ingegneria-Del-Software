package Controller;

import Model.TesseraMensa;
import View.Stampa;

public class NotificaViaEmail implements OperazioneSulContestoPasto{

	@Override
	public void esegui(TesseraMensa tesseraMensa) {
		Stampa.stampa("Inviata una mail a " + tesseraMensa.getPersona().getEmail());
	}

}
