package Model;

import java.util.Date;

import Controller.OperazioneSuPasto;

public abstract class Pasto {

	private int quantitaDacqua;
	private int quantitaFrutta;
	private int quantitaPanino;
	private int quantitaContorno;
	private int costoPasto;
	private Date dataPasto;
	
	public Pasto(Date dataPasto) {
		this.quantitaDacqua = 1;
		this.quantitaFrutta = 1;
		this.quantitaPanino = 1;
		this.quantitaContorno = 1;
		this.costoPasto = 0;
		this.dataPasto = dataPasto;
		
	}
	
	public void settaCosto(int costo) {
		this.costoPasto = costo;
	}
	
	public long getData() {
		return dataPasto.getTime();
	}
	
	public abstract void visitPasto(OperazioneSuPasto operazioneSuPasto);
	
}
