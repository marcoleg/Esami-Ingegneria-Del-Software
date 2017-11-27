package Model;

public class PrenotazioneCamera {
	
	private long dataInizio;
	private long dataFine;
	
	public PrenotazioneCamera(long dataInizio, long dataFine) {
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public long getDataInizio() {
		return dataInizio;
	}

	public long getDataFine() {
		return dataFine;
	}
	
	
}
