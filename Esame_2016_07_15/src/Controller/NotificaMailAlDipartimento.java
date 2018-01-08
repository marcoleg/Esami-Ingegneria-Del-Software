package Controller;

import Model.Esame;
import Model.Studente;
import Model.StudenteNuovoOrdinamento;
import Model.StudenteVecchioOrdinamento;
import View.Stampa;

public class NotificaMailAlDipartimento implements OperazioneSulContestoEsame, VisitorStudente {

	private String email;
	private Studente studente;
	private String stringaDaModificare;
	
	public NotificaMailAlDipartimento(String email, Studente studente) {
		this.email = email;
		this.studente = studente;
		this.stringaDaModificare = "";
	}

	@Override
	public void esegui(Esame esame) {
		studente.visit(this);
		Stampa.stampa("Invio una mail al dipartimento; " + this.stringaDaModificare) ;
	}

	@Override
	public void eseguiSu(StudenteVecchioOrdinamento studenteVecchioOrdinamento) {
		this.stringaDaModificare += "anche al professore, all'indirizzo: " + this.email;
	}

	@Override
	public void eseguiSu(StudenteNuovoOrdinamento studenteNuovoOrdinamento) {
		this.stringaDaModificare += "";
	}

}
