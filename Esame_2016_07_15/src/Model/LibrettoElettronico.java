package Model;

import java.util.ArrayList;

public class LibrettoElettronico {

	private ArrayList<Esame> listaEsami;
	
	public LibrettoElettronico() {
		this.listaEsami = new ArrayList<>();
	}
	
	public void aggiungiEsameAlLibretto(Esame esame) {
		this.listaEsami.add(esame);
	}
	
	public String controlla(Esame esame) {
		for(Esame e : this.listaEsami)
			if(esame.getPadre() == e)
				return "Lo studente può iscriversi all'esame di " + esame.getNome();
		throw new IllegalStateException("Lo studente non può iscriversi all'esame di " + esame.getNome() + " poichè non ha le propedeuticità necessarie!");
	}
}
