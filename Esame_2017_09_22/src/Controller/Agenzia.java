package Controller;

import java.util.ArrayList;

import Model.ViaggioVenduto;
import View.Stampa;

public class Agenzia {
	
	private ArrayList<ViaggioVenduto> listaViaggiDellAgenzia;
	private ArrayList<OperazioneSulContestoViaggio> listaOperazioniSulContestoViaggio;
	
	public Agenzia() {
		this.listaViaggiDellAgenzia = new ArrayList<>();
		this.listaOperazioniSulContestoViaggio = new ArrayList<>();
	}
	
	public void aggiungiViaggio(ViaggioVenduto viaggioVenduto) {
		this.listaViaggiDellAgenzia.add(viaggioVenduto);
		this.eseguiOperazioniSulContestoViaggio(viaggioVenduto);
	}

	public void stampaCostoTotaleInBaseAlNumeroDiPersone(OperazioneDiCalcoloCostoSuViaggio operazione, ViaggioVenduto viaggioVenduto) {
		Stampa.stampa(viaggioVenduto.stampaCostoTotaleInBaseAlNumeroDiPersone(operazione));
	}
	
	public void aggiungiOperazioneAllaListaDelleOperazioniSulContestoViaggio(OperazioneSulContestoViaggio operazione) {
		this.listaOperazioniSulContestoViaggio.add(operazione);
	}
	
	public void eseguiOperazioniSulContestoViaggio(ViaggioVenduto viaggioVenduto) {
		for(OperazioneSulContestoViaggio operazione : this.listaOperazioniSulContestoViaggio)
				operazione.esegui(viaggioVenduto);
	}
}
