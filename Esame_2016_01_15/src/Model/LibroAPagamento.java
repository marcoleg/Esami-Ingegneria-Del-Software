package Model;

import Controller.VisitorLibro;

public class LibroAPagamento extends Libro {

	public LibroAPagamento(String nomeLibro) {
		super(nomeLibro);
	}

	@Override
	public void visit(VisitorLibro visitorLibro) {
		visitorLibro.eseguiSu(this);
	}

	
}
