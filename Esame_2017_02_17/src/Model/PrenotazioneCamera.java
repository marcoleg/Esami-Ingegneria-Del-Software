package Model;

import java.util.ArrayList;import Controller.OperazioneSuCamera;
import Controller.OsservatoreSuCamera;

public class PrenotazioneCamera {
	
	private long dataInizio;
	private long dataFine;
	private ArrayList<OsservatoreSuCamera> listaOperazioni;
	
	public PrenotazioneCamera(long dataInizio, long dataFine, ArrayList<OsservatoreSuCamera> listaOperazioni) {
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.listaOperazioni = listaOperazioni;
		for(OsservatoreSuCamera operazione :this.listaOperazioni)
			operazione.esegui(this);
	}

	public long getDataInizio() {
		return dataInizio;
	}

	public long getDataFine() {
		return dataFine;
	}
	
	
}
