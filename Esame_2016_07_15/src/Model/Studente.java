package Model;

import java.util.ArrayList;

import Controller.VisitorStudente;

public abstract class Studente {

	private int matricola;
	private String nomeStudente;
	private String cognomeStudente;
	private LibrettoElettronico librettoElettronico;
	private ArrayList<Esame> esamiIscritti;
	
	public Studente(int matricola, String nomeStudente, String cognomeStudente) {
		this.matricola = matricola;
		this.nomeStudente = nomeStudente;
		this.cognomeStudente = cognomeStudente;
		this.librettoElettronico = new LibrettoElettronico();
		this.esamiIscritti = new ArrayList<>();
	}

	public LibrettoElettronico getLibrettoElettronico() {
		return this.librettoElettronico;
	}
	
	public void aggiungiAppelloAgliAppelliPartecipanti(Esame esame) {
		this.esamiIscritti.add(esame);
		this.esamiIscritti.get(this.esamiIscritti.indexOf(esame)).getAppello().setIscrizione();
	}
	
	public void aggiungiEsameAlLibretto(Esame esame, int esito) {
		esame.getAppello().setEsito(esito);
		this.librettoElettronico.aggiungiEsameAlLibretto(esame);
	}
	
	public abstract void visit(VisitorStudente visitorStudente);
	
}
