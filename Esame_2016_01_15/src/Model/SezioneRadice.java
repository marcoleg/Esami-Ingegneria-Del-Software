package Model;

import java.util.ArrayList;

import Controller.Calcolo;

public class SezioneRadice extends Sezione {

	private ArrayList<Sezione> listaSezioniFiglie;
	
	public SezioneRadice(String nome) {
		super(nome);
		this.listaSezioniFiglie = new ArrayList<>();
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
		return true;
	}

	@Override
	public ArrayList<Libro> getListaLibri() {
		throw new IllegalStateException("Una Radice non può contenere Libri!");
	}

}
