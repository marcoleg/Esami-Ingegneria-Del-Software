package Model;

import java.util.ArrayList;

public class TesseraMensa {

	private int id;
	private Persona persona;
	private ArrayList<Pasto> pastoUtente;
	
	public TesseraMensa(int id, Persona persona) {
		this.id = id;
		this.persona = persona;
	}

	public int getId() {
		return id;
	}

	public Persona getPersona() {
		return persona;
	}
	
	public void aggiungiPasto(Pasto pasto) {
		this.pastoUtente.add(pasto);
	}
}
