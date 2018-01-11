package Model;

import java.util.ArrayList;

import Controller.VisitorLibro;

public abstract class Libro {

	private String nomeLibro;
	private ArrayList<Prenotazione> listaPrenotazioniLibro;

	public Libro(String nomeLibro) {
		this.nomeLibro = nomeLibro;
		this.listaPrenotazioniLibro = new ArrayList<>();
	}
	
	public void aggiungiPrenotazione(Prenotazione prenotazione) {
		this.listaPrenotazioniLibro.add(prenotazione);
	}
	
	public String getNomeLibro() {
		return this.nomeLibro;
	}
	
	public ArrayList<Prenotazione> getListaPrenotazioni() {
		return this.listaPrenotazioniLibro;
	}
	
	public boolean isDisponibile() {
		boolean temp = false;
		for(Prenotazione prenotazione : this.listaPrenotazioniLibro)
			temp = temp || prenotazione.isDisponibile();
		return temp;
	}
	
	public abstract void visit(VisitorLibro visitorLibro);
	
}
