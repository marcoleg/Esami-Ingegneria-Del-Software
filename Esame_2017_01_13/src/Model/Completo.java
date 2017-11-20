package Model;

import java.util.Date;

import Controller.OperazioneSuPasto;

public class Completo extends Pasto{

	public Completo(Date dataPasto) {
		super(dataPasto);
	}

	@Override
	public void visitPasto(OperazioneSuPasto operazioneSuPasto) {
		operazioneSuPasto.esegui(this);
	}
	
}
