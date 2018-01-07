package Model;

import java.util.Date;

public class Tratta {

	private Citta cittaAndata;
	private Citta cittaRitorno;
	private long orarioPartenza;
	private long orarioArrivo;
	private Date ora;
	
	public Tratta(Citta cittaAndata, Citta cittaRitorno, long orarioPartenza, long orarioArrivo) {
		this.cittaAndata = cittaAndata;
		this.cittaRitorno = cittaRitorno;
		this.orarioPartenza = orarioPartenza;
		this.orarioArrivo = orarioArrivo;
		this.ora = new Date();
	}
	
	
}
