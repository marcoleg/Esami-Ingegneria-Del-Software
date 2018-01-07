package Controller;

import java.util.ArrayList;

import Model.Biglietto;
import Model.Citta;
import Model.Cliente;
import Model.Tratta;
import Model.Viaggio;

public class CompagniaAutobus {

	private ArrayList<Cliente> listaClienti;
	private ArrayList<Tratta> listaTratte;
	private ArrayList<Viaggio> listaViaggi;
	private ArrayList<Biglietto> listaBiglietti;
	
	public CompagniaAutobus() {
		this.listaBiglietti = new ArrayList<>();
		this.listaClienti = new ArrayList<>();
		this.listaTratte = new ArrayList<>();
		this.listaViaggi = new ArrayList<>();
	}
	
	public void aggiungiCliente(int idCliente, String nomeCliente, String cognomeCliente) {
		this.listaClienti.add(new Cliente(idCliente, nomeCliente, cognomeCliente));
	}
	
	public void aggiungiTratta(Citta cittaAndata, Citta cittaRitorno, long orarioPartenza, long orarioArrivo) {
		this.listaTratte.add(new Tratta(cittaAndata, cittaRitorno, orarioPartenza, orarioArrivo));
	}
	
	public void aggiungiViaggio(Tratta tratta, int postiTotaliAutobus) {
		this.listaViaggi.add(new Viaggio(tratta, postiTotaliAutobus));
	}
	
	public void aggiungiBiglietto(Cliente cliente, Tratta tratta, int posto) {
		this.listaBiglietti.add(new Biglietto(cliente, tratta, posto));
	}
	
	
	
}
