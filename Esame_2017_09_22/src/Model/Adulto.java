package Model;

import Controller.VisitorCliente;

public class Adulto extends TipoCliente {

	public Adulto(String nome, String cognome, String dataDiNascita) {
		super(nome, cognome, dataDiNascita);
	}

	@Override
	public void visitCliente(VisitorCliente visitorPersona) {
		visitorPersona.eseguiSu(this);
	}

}
