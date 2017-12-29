package Model;

import java.util.Date;

public class Pasto {
	
	protected int quantitaDacqua;
	protected int quantitaPanino;
	protected int quantitaFrutta;
	protected int quantitaContorno;
	protected Date dataPasto;
	
	public Pasto(Date dataPasto) {
		this.quantitaDacqua = 1;
		this.quantitaPanino = 1;
		this.quantitaFrutta = 1;
		this.quantitaContorno = 1;
		this.dataPasto = dataPasto;
	}
	
}
