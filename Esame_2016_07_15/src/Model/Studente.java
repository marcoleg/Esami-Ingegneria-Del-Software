package Model;

import java.util.ArrayList;

public class Studente {

	private int matricola;
	private String nomeStudente;
	private String cognomeStudente;
	private LibrettoElettronico librettoElettronico;
	private ArrayList<AppelloDesame> appelliIscritti;
	
	public Studente(int matricola, String nomeStudente, String cognomeStudente) {
		this.matricola = matricola;
		this.nomeStudente = nomeStudente;
		this.cognomeStudente = cognomeStudente;
		this.librettoElettronico = new LibrettoElettronico();
		this.appelliIscritti = new ArrayList<>();
	}

	public LibrettoElettronico getLibrettoElettronico() {
		return this.librettoElettronico;
	}
	
	public void aggiungiAppelloAgliAppelliPartecipanti(AppelloDesame appelloDesame) {
		this.appelliIscritti.add(appelloDesame);
		this.appelliIscritti.get(this.appelliIscritti.indexOf(appelloDesame)).setIscrizione();
	}
	
	public void aggiungiEsameAlLibretto(GruppoDiInsegnamento gruppo, Esame esame, int esito) {
		esame.getAppello().setEsito(esito);
		gruppo.aggiungiEsameAllaListaDegliEsamiDiQuestoGruppo(esame);
		this.librettoElettronico.aggiungiGruppoDinsegnamento(gruppo);
	}
	
}
