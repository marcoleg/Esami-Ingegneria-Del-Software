package Model;

import java.util.Date;

import Controller.OperazioneSuPasto;

public abstract class Pasto {
	
	protected int quantitaDacqua;
	protected int quantitaPanino;
	protected int quantitaFrutta;
	protected int quantitaContorno;
	protected Date dataPasto;
	protected int costoPasto;
	
	public Pasto(Date dataPasto) {
		this.quantitaDacqua = 1;
		this.quantitaPanino = 1;
		this.quantitaFrutta = 1;
		this.quantitaContorno = 1;
		this.dataPasto = dataPasto;
		this.costoPasto = 0;
	}
	
	public void settaCosto(int costoDaSettare) {
		this.costoPasto = costoDaSettare;
	}
	
	public Date getDataPasto() {
		return this.dataPasto;
	}
	
	public abstract void visitPasto(OperazioneSuPasto operazioneSuPasto);
	
}
