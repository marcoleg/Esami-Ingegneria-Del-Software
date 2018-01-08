package Controller;

import java.util.ArrayList;

import Model.AppelloDesame;
import Model.Esame;
import Model.Esame;
import Model.Studente;
import View.Stampa;

public class Universita {
	
	private ArrayList<Studente> listaStudenti;
	private ArrayList<Esame> listaEsami;
	
	public Universita() {
		this.listaEsami = new ArrayList<>();
		this.listaStudenti = new ArrayList<>();
	}

	public void aggiungiEsameAcuiLoStudenteSiIscrive(Studente studente, Esame esame) {
		Stampa.stampa(studente.getLibrettoElettronico().controlla(esame));
		studente.aggiungiAppelloAgliAppelliPartecipanti(esame);
	}
	
	public void aggiungiEsameAlLibrettoDelloStudente(Studente studente, Esame esame, int esito) {
		studente.aggiungiEsameAlLibretto(esame, esito);
	}
	
	public void aggiungiEsameAllaListaDegliEsami(Esame esame) {
		this.listaEsami.add(esame);
		//gruppo.aggiungiEsameAllaListaDegliEsamiDiQuestoGruppo(esame);
	}
}
