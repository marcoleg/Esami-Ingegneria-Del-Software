package Model;

import java.util.ArrayList;

public class Tessera {

	private ArrayList<Libro> listaLibri;
	private Utente utente;
	
	public Tessera(Utente utente) {
		this.listaLibri = new ArrayList<>();
		this.utente = utente;
	}

	public ArrayList<Libro> getListaLibri() {
		return listaLibri;
	}

	public Utente getUtente() {
		return utente;
	}
	
	
	
}
