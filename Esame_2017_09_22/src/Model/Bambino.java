package Model;

import Controller.VisitorCliente;

public class Bambino extends TipoCliente {

	public Bambino(String nome, String cognome, String dataDiNascita) {
		super(nome, cognome, dataDiNascita);
	}

	@Override
	public void visitCliente(VisitorCliente visitorPersona) {
		visitorPersona.eseguiSu(this);
	}

}
