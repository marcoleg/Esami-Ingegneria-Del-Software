package Model;

public class Citta {

	private String nomeCitta;
	private String Nazione;
	private String Continente;
	
	public Citta(String nomeCitta, String nazione, String continente) {
		this.nomeCitta = nomeCitta;
		Nazione = nazione;
		Continente = continente;
	}
	
	public String getNomeCitta() {
		return this.nomeCitta;
	}
	
	public String getNomeNazione() {
		return this.Nazione;
	}

	public String getNomeContinente() {
		return this.Continente;
	}
	
}
