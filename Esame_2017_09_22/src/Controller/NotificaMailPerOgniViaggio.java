package Controller;

import Model.ViaggioVenduto;
import View.Stampa;

public class NotificaMailPerOgniViaggio implements OperazioneSulContestoViaggio {

	@Override
	public void esegui(ViaggioVenduto viaggioVenduto) {
		Stampa.stampa("Invio una mail a info@agenziaViaggi.it per il viaggio a " + viaggioVenduto.getPacchettoViaggio().getCitta().getNomeCitta());
	}

}
