package Model;

import java.awt.IllegalComponentStateException;
import java.util.ArrayList;

import Controller.CalcoloSuPosti;

public class Viaggio {

	private Tratta tratta;
	private ArrayList<PostoSedile> postiTotali;
	private ArrayList<PostoSedile> postiOccupati;
	private int costoBiglietto;
	private CalcoloSuPosti algoritmoDiCalcolo;
	private ArrayList<Biglietto> bigliettiVenduti;
	
	public Viaggio(Tratta tratta, int numeroTotaleDiPosti, int costoBiglietto) { 
		this.tratta = tratta;
		this.postiOccupati = new ArrayList<>();
		this.postiTotali = settaNumeroTotaliDiPostiAutobus(numeroTotaleDiPosti);
		this.costoBiglietto = costoBiglietto;
		this.bigliettiVenduti = new ArrayList<>();
	}
	
	public ArrayList<PostoSedile> settaNumeroTotaliDiPostiAutobus(int numeroTotaleDiPosti){
		this.postiTotali = new ArrayList<>();
		for(int i = 0; i < numeroTotaleDiPosti; i++) {
			PostoSedile temp = new PostoSedile(i+1);
			this.postiTotali.add(temp);
		}
		return this.postiTotali;
	}
	
	public boolean isDisponibileBigliettoNelPosto(int numeroPosto){
		if(this.postiOccupati.size() == 0)
			return true;
		else
			for(PostoSedile posto : this.postiOccupati)
				if(posto.getNumeroPosto() == numeroPosto)
					return false;
		return true;
	}
	
	public void registraBiglietto(int numeroPosto) {
		if(!isDisponibileBigliettoNelPosto(numeroPosto))
			throw new IllegalComponentStateException("Non è possibile registrare un biglietto in quel posto poichè è occupato!");
		else
			this.postiOccupati.add(new PostoSedile(numeroPosto));
	}
	
	public int getcostoBiglietto() {
		return this.costoBiglietto;
	}
	
	public int getPostiRimasti() {
		return this.postiTotali.size() - this.postiOccupati.size();
	}
	
	public void setAlgoritmoDiCalcoloBiglietto(CalcoloSuPosti algoritmoDiCalcoloCostoBiglietto) {
		this.algoritmoDiCalcolo = algoritmoDiCalcoloCostoBiglietto;
	}
	
	public int getCostoBigliettoDinamicamente(CalcoloSuPosti algoritmoDiCalcolo) {
		return algoritmoDiCalcolo.calcola();
	}
	
	public CalcoloSuPosti getAlgoritmoDiCalcoloCostoBiglietto() {
		return this.algoritmoDiCalcolo;
	}
	
	public void aggiungiBigliettoAllaListaDeiBiglietti(Biglietto biglietto) {
		this.bigliettiVenduti.add(biglietto);
	}
	
	public int incassoTotale() {
		int temp = 0;
		for (Biglietto biglietto : this.bigliettiVenduti)
			temp += biglietto.getCostoBiglietto();
		return temp;
	}
	
	public ArrayList<Biglietto> getBigliettiVenduti(){
		return this.bigliettiVenduti;
	}
}
