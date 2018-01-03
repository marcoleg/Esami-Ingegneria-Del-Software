package Controller;

import Model.Pasto;
import Model.TesseraMensa;
import View.Stampa;

public class NotificaViaMailPerOgniPasto implements OperazioneSulContestoPasto {

	@Override
	public void esegui(TesseraMensa tesseraMensa) {

		Stampa.stampa("Mail inviata a info@mensa.it perchè è stato registrato un pasto");
		
	}

}
