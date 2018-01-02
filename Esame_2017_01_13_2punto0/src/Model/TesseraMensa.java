package Model;

import java.util.ArrayList;

public class TesseraMensa {
	
	private int id;
	private Persona persona;
	private ArrayList<Pasto> listaPasti;
	
	public TesseraMensa(int id, Persona persona) {
		this.id = id;
		this.persona = persona;
		this.listaPasti = new ArrayList<Pasto>();
	}
	
	public void aggiungiPastoAllaListaPasti(Pasto pasto) {
		this.listaPasti.add(pasto);
	}
	
	public Persona getPersona() {
		return this.persona;
	}
	
	public ArrayList<Pasto> getListaPasti(){
		return this.listaPasti;
	}
}
