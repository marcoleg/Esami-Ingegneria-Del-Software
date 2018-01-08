package Model;

import java.util.Date;

public class RaccoltaAlbero {

	private Date dataInizio;
	private Date dataFine;
	private int pesoFruttiRaccolti;
	
	public RaccoltaAlbero(Date dataInizio, Date dataFine, int pesoFruttiRaccolti) {
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.pesoFruttiRaccolti = pesoFruttiRaccolti;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public int getPesoFruttiRaccolti() {
		return pesoFruttiRaccolti;
	}
	
	
	
}
