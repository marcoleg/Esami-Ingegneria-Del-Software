package Model;

import java.util.Date;

import Controller.OperazioneSuPasto;

public class Primo extends Pasto{

	public Primo(Date dataPasto) {
		super(dataPasto);
	}

	@Override
	public void visitPasto(OperazioneSuPasto operazioneSuPasto) {
		operazioneSuPasto.esegui(this);
	}
	
}
