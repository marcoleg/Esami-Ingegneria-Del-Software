package Model;

import java.util.ArrayList;

public class Studente {

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
	
	public void aggiungiAppelloAgliAppelliPartecipanti(Esame appelloDesame) {
		this.esamiIscritti.add(appelloDesame);
		this.esamiIscritti.get(this.esamiIscritti.indexOf(appelloDesame)).getAppello().setIscrizione();
	}
	
	public void aggiungiEsameAlLibretto(Esame esame, int esito) {
		esame.getAppello().setEsito(esito);
		//gruppo.aggiungiEsameAllaListaDegliEsamiDiQuestoGruppo(esame);
		this.librettoElettronico.aggiungiEsameAlLibretto(esame);
	}
	
}
