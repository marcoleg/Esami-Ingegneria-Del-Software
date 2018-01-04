package Model;

import java.util.Date;

public class PrenotazioneCamera {

	private long dataInizioPrenotazione;
	private long dataFinePrenotazione;
	
	public PrenotazioneCamera(long dataInizioPrenotazione, long dataFinePrenotazione) {
		this.dataInizioPrenotazione = dataInizioPrenotazione;
		this.dataFinePrenotazione = dataFinePrenotazione;
	}
	
	public long getDataFine() {
		return this.dataFinePrenotazione;
	}
	
	public long getDataInizio() {
		return this.dataInizioPrenotazione;
	}
}
