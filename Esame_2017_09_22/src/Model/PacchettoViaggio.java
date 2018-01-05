package Model;

public class PacchettoViaggio {

	private String nome;
	private String descrizione;
	private int costo;
	private int durataInGiorni;
	private Citta citta;
	
	public PacchettoViaggio(String nome, String descrizione, int costoApersona, int durataInGiorni, Citta citta) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costoApersona;
		this.durataInGiorni = durataInGiorni;
		this.citta = citta;
	}
	
	public void setCosto(int divisore) {
		this.costo = this.costo / divisore;
	}
	
	public int getCosto() {
		return this.costo;
	}
	
	public Citta getCitta() {
		return this.citta;
	}
}
