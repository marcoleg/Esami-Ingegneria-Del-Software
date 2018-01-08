package Controller;

import Model.RaccoltaAlbero;
import View.Stampa;

public class NotificaEmailPerOgniRaccolta implements OperazioneSulContestoRaccolta {
	
	private String emailDaNotificare;

	public NotificaEmailPerOgniRaccolta(String emailDaNotificare) {
		this.emailDaNotificare = emailDaNotificare;
	}

	@Override
	public void esegui(RaccoltaAlbero raccoltaAlbero) {
		Stampa.stampa("Una raccolta è avvenuta il " + (1900+raccoltaAlbero.getDataFine().getYear()) + 
				"/" + raccoltaAlbero.getDataFine().getMonth() + 1 + "/" + raccoltaAlbero.getDataFine().getDate()  + " \nInvio una mail a " + this.emailDaNotificare);
	}

}
