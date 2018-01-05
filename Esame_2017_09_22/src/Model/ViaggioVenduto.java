package Model;

public class ViaggioVenduto {

	private PacchettoViaggio pacchetto;
	private long dataInizio;
	private long dataFine;
	private int costoTotaleInBaseAlNumeroDiPersone;
	
	public ViaggioVenduto(PacchettoViaggio pacchetto, long dataInizio, long dataFine, int costoTotaleInBaseAlNumeroDiPersone) {
		this.pacchetto = pacchetto;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.costoTotaleInBaseAlNumeroDiPersone = costoTotaleInBaseAlNumeroDiPersone;
	}
	
}
