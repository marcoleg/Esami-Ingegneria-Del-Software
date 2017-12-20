package Model;

import java.util.Date;

public class Tratta {

	private String cittaAndata;
	private String cittaRitorno;
	private long orarioAndata;
	private long orarioRitorno;
	private long tempoTratta;
	
	public Tratta(String cittaAndata, String cittaRitorno, long orarioAndata, long orarioRitorno, long tempoTratta) {
		this.cittaAndata = cittaAndata;
		this.cittaRitorno = cittaRitorno;
		this.orarioAndata = orarioAndata;
		this.orarioRitorno = orarioRitorno;
		this.tempoTratta = tempoTratta;
	}
	
	
}
