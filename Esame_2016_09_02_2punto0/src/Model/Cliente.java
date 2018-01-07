package Model;

public class Cliente {

	protected int idCliente;
	protected String nome;
	protected String cognome;
	protected int numeroViaggi;
	
	public Cliente(int idCliente, String nome, String cognome) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cognome = cognome;
		this.numeroViaggi = 0;
	}
	
	public String getNomeEcognome() {
		return this.nome + " " + this.cognome;
	}
	
	public void aumentaNumeroViaggi() {
		this.numeroViaggi++;
	}
	
	public int getNumeroViaggi() {
		return this.numeroViaggi;
	}
}
