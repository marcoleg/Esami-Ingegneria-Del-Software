package Controller;

import java.util.ArrayList;

import Model.Esame;
import Model.Studente;

public class Universita {
	
	private ArrayList<Studente> listaStudenti;
	private ArrayList<Esame> listaEsami;
	
	public Universita() {
		this.listaEsami = new ArrayList<>();
		this.listaStudenti = new ArrayList<>();
	}

}
