package Model;

import Controller.VisitorLibro;

public class LibroNonAPagamento extends Libro {

	public LibroNonAPagamento(String nomeLibro) {
		super(nomeLibro);
	}


	@Override
	public void visit(VisitorLibro visitorLibro) {
		visitorLibro.eseguiSu(this);
	}
	
}
