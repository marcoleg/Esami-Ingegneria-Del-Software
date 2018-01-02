package Model;

import java.util.Date;

import Controller.OperazioneSuPasto;

public class Secondo extends Pasto {

	public Secondo(Date dataPasto) {
		super(dataPasto);
	}

	@Override
	public void visitPasto(OperazioneSuPasto operazioneSuPasto) {
		operazioneSuPasto.eseguiSu(this);		
	}

	
}
