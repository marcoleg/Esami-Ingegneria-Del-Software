package Model;

import java.util.ArrayList;

import Controller.Calcolo;

public class SezioneInterna extends Sezione {

	private ArrayList<Sezione> listaSezioniFiglie;
	private Sezione padre;
	
	public SezioneInterna(String nome, Sezione padre) {
		super(nome);
		this.listaSezioniFiglie = new ArrayList<>();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
	}

	@Override
	public ArrayList<Sezione> getFigli() {
		return this.listaSezioniFiglie;
	}

	@Override
	public void aggiungiFiglio(Sezione sezione) {
		this.listaSezioniFiglie.add(sezione);
	}

	@Override
	public void aggiungiLibroAFoglia(Libro libro) {
		throw new IllegalStateException("Non è possibile aggiungere un libro ad una NON foglia");
	}

	@Override
	public int calcola(Calcolo calcolo) {
		int count = 0;
		
		for(Sezione sezione : this.listaSezioniFiglie)
			count+= sezione.calcola(calcolo);
		
		return count;
	}

	@Override
	public boolean isRadice() {
		return false;
	}

	@Override
	public ArrayList<Libro> getListaLibri() {
		throw new IllegalStateException("Una Interna non può contenere Libri!");
	}
}
