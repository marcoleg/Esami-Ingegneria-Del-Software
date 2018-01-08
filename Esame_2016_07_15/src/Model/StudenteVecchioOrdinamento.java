package Model;

import Controller.VisitorStudente;

public class StudenteVecchioOrdinamento extends Studente {

	public StudenteVecchioOrdinamento(int matricola, String nomeStudente, String cognomeStudente) {
		super(matricola, nomeStudente, cognomeStudente);
	}

	@Override
	public void visit(VisitorStudente visitorStudente) {
		visitorStudente.eseguiSu(this);
	}
}
