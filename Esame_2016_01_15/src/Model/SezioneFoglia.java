package Model;

import java.util.ArrayList;

import Controller.Calcolo;

public class SezioneFoglia extends Sezione {

	private ArrayList<Sezione> listaSezioniFiglie;
	private Sezione padre;
	private ArrayList<Libro> listaLibri;
	
	public SezioneFoglia(String nome, Sezione padre) {
		super(nome);
		this.listaSezioniFiglie = new ArrayList<>();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
		this.listaLibri = new ArrayList<>();
	}

	@Override
	public ArrayList<Sezione> getFigli() {
		throw new IllegalStateException("Una Sezione foglia non può restituire figli!");
	}
	
	@Override
	public void aggiungiFiglio(Sezione sezione) {
		throw new IllegalStateException("Una Sezione foglia non può aggiungere figli!");
	}

	@Override
	public void aggiungiLibroAFoglia(Libro libro) {
		this.listaLibri.add(libro);
	}
	

	@Override
	public int calcola(Calcolo calcolo) {
		return calcolo.esegui(this.listaLibri);
	}

	@Override
	public boolean isRadice() {
		return false;
	}

	@Override
	public ArrayList<Libro> getListaLibri() {
		return this.listaLibri;
	}

}
