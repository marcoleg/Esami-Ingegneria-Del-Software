package Model;

import Controller.VisitorStudente;

public class StudenteNuovoOrdinamento extends Studente {

	public StudenteNuovoOrdinamento(int matricola, String nomeStudente, String cognomeStudente) {
		super(matricola, nomeStudente, cognomeStudente);
	}

	@Override
	public void visit(VisitorStudente visitorStudente) {
		visitorStudente.eseguiSu(this);
	}

	
}
