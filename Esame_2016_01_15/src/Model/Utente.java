package Model;

public class Utente {

	private int id;
	private String nomeEcognomeUtente;
	
	public Utente(int id, String nomeEcognomeUtente) {
		this.id = id;
		this.nomeEcognomeUtente = nomeEcognomeUtente;
	}

	public int getId() {
		return id;
	}

	public String getNomeEcognomeUtente() {
		return nomeEcognomeUtente;
	}
	
	
}
