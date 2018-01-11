package Model;

import java.util.Date;

public class Prenotazione {

	private Date dataInizio;
	private Date dataFine;
	private Tessera tesseraUtente;
	
	public Prenotazione(Date dataInizio, Date dataFine, Tessera tesseraUtente) {
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.tesseraUtente = tesseraUtente;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public Tessera getTesseraUtente() {
		return tesseraUtente;
	}
	
	public boolean isDisponibile() {
		Date ora = new Date();
		if((ora.before(this.dataInizio) && ora.before(dataFine)) || (ora.after(this.dataFine) && ora.after(this.dataInizio)))
			return true;
		else
			return false;
	}

}
