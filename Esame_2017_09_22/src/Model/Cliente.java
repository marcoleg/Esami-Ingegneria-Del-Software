package Model;

public abstract class Cliente {
	
	protected String nome;
	protected String cognome;
	protected String dataDiNascita;
	
	public Cliente(String nome, String cognome, String dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	
}
