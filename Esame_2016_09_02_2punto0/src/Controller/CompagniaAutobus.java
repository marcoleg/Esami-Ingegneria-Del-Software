package Controller;

import java.util.ArrayList;

import Model.Biglietto;
import Model.CartaFedelta;
import Model.Citta;
import Model.Cliente;
import Model.Tratta;
import Model.Viaggio;
import View.Stampa;

public class CompagniaAutobus {

	private ArrayList<Cliente> listaClienti;
	private ArrayList<Tratta> listaTratte;
	private ArrayList<Viaggio> listaViaggi;
	private ArrayList<Biglietto> listaBiglietti;
	private CartaFedelta cartaFedelta;
	private ArrayList<StatisticaGuadagni> listaStatistiche;
	
	public CompagniaAutobus(CartaFedelta cartaFedelta) {
		this.listaBiglietti = new ArrayList<>();
		this.listaClienti = new ArrayList<>();
		this.listaTratte = new ArrayList<>();
		this.listaViaggi = new ArrayList<>();
		this.cartaFedelta = cartaFedelta;
		this.listaStatistiche = new ArrayList<>();
	}
	
	public Cliente aggiungiCliente(int idCliente, String nomeCliente, String cognomeCliente) {
		Cliente cliente = new Cliente(idCliente, nomeCliente, cognomeCliente);
		this.listaClienti.add(cliente);
		return cliente;
	}
	
	public Tratta aggiungiTratta(Citta cittaAndata, Citta cittaRitorno, long orarioPartenza, long orarioArrivo) {
		Tratta tratta = new Tratta(cittaAndata, cittaRitorno, orarioPartenza, orarioArrivo);
		this.listaTratte.add(tratta);
		return tratta;
	}
	
	public Viaggio aggiungiViaggio(Tratta tratta, int postiTotaliAutobus, int costoBiglietto) { 
		Viaggio viaggio = new Viaggio(tratta, postiTotaliAutobus, costoBiglietto); 
		this.listaViaggi.add(viaggio);
		return viaggio;
	}
	
	public void aggiungiBiglietto(Viaggio viaggio, Cliente cliente, Tratta tratta, int posto) {
		this.cartaFedelta.aggiornaUsufruentiCarta(cliente);
		viaggio.registraBiglietto(posto);
		Biglietto biglietto = new Biglietto(cliente, tratta, 
								this.cartaFedelta.getStrategia().calcolaSconto(cliente, this.cartaFedelta.getListaClienti(),
										viaggio.getCostoBigliettoDinamicamente(viaggio.getAlgoritmoDiCalcoloCostoBiglietto())), posto);
		this.listaBiglietti.add(biglietto);
		Stampa.stampa("Il biglietto di " + cliente.getNomeEcognome() + " è stato registrato");
		cliente.aumentaNumeroViaggi();
		viaggio.aggiungiBigliettoAllaListaDeiBiglietti(biglietto);
		Stampa.stampa("L'ultima statistica sul guadagno di questo viaggio è: " + this.calcolaStatisticheSu(viaggio));
	}
	
	public void stampaIncassoTotale(Viaggio viaggio) {
		Stampa.stampa("L'incasso totale per questo viaggio è stato di: " + viaggio.incassoTotale());
	}
	
	public void aggiungiStatisticaSuiGuadagni(StatisticaGuadagni statistica) {
		this.listaStatistiche.add(statistica);
	}
	
	public int calcolaStatisticheSu(Viaggio viaggio) {
		int temp = 0;
		for(StatisticaGuadagni statistica : this.listaStatistiche)
			temp += statistica.calcola(viaggio);
		return temp;
	}
}
