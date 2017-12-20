package Model;

import java.util.ArrayList;

public class Agenzia {

	private ArrayList<Biglietto> biglietti;
	private ArrayList<Viaggio> viaggi;
	private ArrayList<Cliente> clienti;
	private ArrayList<Tratta> tratte;
	
	public Agenzia(ArrayList<Biglietto> biglietti, ArrayList<Viaggio> viaggi, ArrayList<Cliente> clienti,
			ArrayList<Tratta> tratte) {
		this.biglietti = new ArrayList<Biglietto>();
		this.viaggi = new ArrayList<Viaggio>();
		this.clienti = new ArrayList<Cliente>();
		this.tratte = new ArrayList<Tratta>();
	}
	
	public void isDisponibile(Biglietto biglietto) {
		
	}
	
}
