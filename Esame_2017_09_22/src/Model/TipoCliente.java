package Model;

import Controller.VisitorCliente;

public abstract class TipoCliente implements Cliente {
	
	protected String nome;
	protected String cognome;
	protected String dataDiNascita;
	
	public TipoCliente(String nome, String cognome, String dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public String getDataNascita() {
		return this.dataDiNascita;
	}
	
	public abstract void visitCliente(VisitorCliente visitorPersona);
}
