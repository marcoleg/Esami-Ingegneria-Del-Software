package Model;

public class PacchettoViaggio {

	private String nome;
	private String descrizione;
	private int costo;
	private int durataInGiorni;
	private Citta citta;
	
	public PacchettoViaggio(String nome, String descrizione, int costo, int durataInGiorni, Citta citta) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.durataInGiorni = durataInGiorni;
		this.citta = citta;
	}
	
}
