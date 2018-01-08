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
	private ArrayList<OperazioneSulContestoEsame> listaOperazioni;
	
	public Universita() {
		this.listaEsami = new ArrayList<>();
		this.listaStudenti = new ArrayList<>();
		this.listaOperazioni = new ArrayList<>();
	}
	
	public void aggiungiOperazioniAllaListaOperazioniSulContestoEsame(OperazioneSulContestoEsame operazione) {
		this.listaOperazioni.add(operazione);
	}

	public void aggiungiEsameAcuiLoStudenteSiIscrive(Studente studente, Esame esame) {
		if(esame.isRadice())
			studente.aggiungiAppelloAgliAppelliPartecipanti(esame);
		else
			Stampa.stampa(studente.getLibrettoElettronico().controlla(esame));
		studente.aggiungiAppelloAgliAppelliPartecipanti(esame);
	}
	
	public void aggiungiEsameAlLibrettoDelloStudente(Studente studente, Esame esame, int esito) {
		studente.aggiungiEsameAlLibretto(esame, esito);
		OperazioneSulContestoEsame operazione = new NotificaMailAlDipartimento(esame.getEmailProfessore(), studente);
		operazione.esegui(esame);
		for(OperazioneSulContestoEsame o : this.listaOperazioni) 
			o.esegui(esame);
	}
	
	public void aggiungiEsameAllaListaDegliEsami(Esame esame) {
		this.listaEsami.add(esame);
	}
}
