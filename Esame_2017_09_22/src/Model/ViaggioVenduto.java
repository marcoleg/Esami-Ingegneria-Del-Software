package Model;

import java.util.ArrayList;

import Controller.OperazioneDiCalcoloCostoSuViaggio;
import Controller.VisitorCliente;
import View.Stampa;

public class ViaggioVenduto {

	private PacchettoViaggio pacchetto;
	private long dataInizio;
	private long dataFine;
	private int costoTotaleInBaseAlNumeroDiPersone;
	private ArrayList<Cliente> listaClienti;
	
	public ViaggioVenduto(PacchettoViaggio pacchetto, long dataInizio, long dataFine) {
		this.pacchetto = pacchetto;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.listaClienti = new ArrayList<>();
		this.costoTotaleInBaseAlNumeroDiPersone = 0;
	}
	
	public void aggiungiCliente(Cliente cliente) {
		this.listaClienti.add(cliente);
	}
	
	public void stampaCostoTotaleInBaseAlNumeroDiPersone(OperazioneDiCalcoloCostoSuViaggio operazione) {
		Stampa.stampa("Il costo totale del viaggio venduto è di: " + operazione.calcolaCosto());
	}
	
	public PacchettoViaggio getPacchettoViaggio() {
		return this.pacchetto;
	}
	
	public ArrayList<Cliente> getListaClienti(){
		return this.listaClienti;
	}

}
