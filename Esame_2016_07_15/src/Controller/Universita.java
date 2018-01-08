package Controller;

import java.util.ArrayList;

import Model.AppelloDesame;
import Model.Esame;
import Model.GruppoDiInsegnamento;
import Model.Studente;

public class Universita {
	
	private ArrayList<Studente> listaStudenti;
	private ArrayList<GruppoDiInsegnamento> listaGruppiDiInsegnamento;
	private ArrayList<Esame> listaEsami;
	
	public Universita() {
		this.listaEsami = new ArrayList<>();
		this.listaStudenti = new ArrayList<>();
		this.listaGruppiDiInsegnamento = new ArrayList<>();
	}

	public void aggiungiEsameAcuiLoStudenteSiIscrive(Studente studente, Esame esame) {
		//for(GruppoDiInsegnamento gruppo : this.listaGruppiDiInsegnamento)
			//if(gruppo.getListaEsami().contains(esame))
		studente.aggiungiAppelloAgliAppelliPartecipanti(esame);
	}
	
	public void aggiungiEsameAlLibrettoDelloStudente(Studente studente, GruppoDiInsegnamento gruppo, Esame esame, int esito) {
		studente.aggiungiEsameAlLibretto(gruppo, esame, esito);
	}
	
	public void aggiungiEsameAllaListaDegliEsami(GruppoDiInsegnamento gruppo, Esame esame) {
		this.listaGruppiDiInsegnamento.add(gruppo);
		this.listaEsami.add(esame);
		gruppo.aggiungiEsameAllaListaDegliEsamiDiQuestoGruppo(esame);
	}
}
