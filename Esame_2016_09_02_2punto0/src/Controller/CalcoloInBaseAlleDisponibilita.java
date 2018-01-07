package Controller;

import java.awt.IllegalComponentStateException;

import Model.Viaggio;

public abstract class CalcoloInBaseAlleDisponibilita implements CalcoloSuPosti {

	protected int numeroPostiRimasti;
	protected Viaggio viaggio;
	
	public CalcoloInBaseAlleDisponibilita(Viaggio viaggio) {
		this.viaggio = viaggio;
		this.numeroPostiRimasti = viaggio.getPostiRimasti();
	}
	
	public void aggiornaPostiRimasti() {
		if(this.numeroPostiRimasti < 0)
			throw new IllegalComponentStateException("ERRORE: si stanno prenotando più posti rispetto a quelli disponibili!");
		else
			this.numeroPostiRimasti--;
	}

	public abstract int calcola();
	
}
