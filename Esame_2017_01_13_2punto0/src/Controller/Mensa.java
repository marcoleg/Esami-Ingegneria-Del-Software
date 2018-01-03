package Controller;


import java.util.ArrayList;

import Model.Pasto;
import Model.Persona;
import Model.Team;
import Model.TesseraMensa;
import View.Stampa;

public class Mensa {

	private ArrayList<Persona> listaPersone;
	private ArrayList<TesseraMensa> listaTessereMensa;
	private ArrayList<Team> listaTeam;
	private String nomeMensa;
	private ArrayList<OperazioneSulContestoPasto> listaOperazioniSulContestoPasto;
	
	public Mensa(String nomeMensa) {
		this.listaPersone = new ArrayList<Persona>();
		this.listaTessereMensa = new ArrayList<TesseraMensa>();
		this.listaTeam = new ArrayList<Team>();
		this.nomeMensa = nomeMensa;	
		this.listaOperazioniSulContestoPasto = new ArrayList<>();
	}
	
	public void aggiungiPersona(Persona persona) {	
		this.listaPersone.add(persona);	
	}
	
	public void aggiungiTessera(TesseraMensa tesseraMensa) {	
		this.listaTessereMensa.add(tesseraMensa);
	}
	
	public void aggiungiPastiATessera(TesseraMensa tessera, ArrayList<Pasto> listaPastiDaAggiungere) {
		for(Pasto p : listaPastiDaAggiungere) {
			tessera.aggiungiPastoAllaListaPasti(p);
			for(OperazioneSulContestoPasto opscp : this.listaOperazioniSulContestoPasto)
				opscp.esegui(tessera);
		}
	}
	
	public void aggiungiOperazioneAllaListaDelleOperazioniSulContestoPasto(OperazioneSulContestoPasto operazioneSulContestoPasto) {
		this.listaOperazioniSulContestoPasto.add(operazioneSulContestoPasto);
	}
	
	public ArrayList<Pasto> getListaPasti(){
		ArrayList<Pasto> listaPasti = new ArrayList<>();
		for(TesseraMensa tm : this.listaTessereMensa)
			for(Pasto p : tm.getListaPasti())
				listaPasti.add(p);
		return listaPasti;
	}
	
	public void eseguiOperazioniSuQuantoSpendonoLePersone() {
		for(TesseraMensa tm : this.listaTessereMensa) {
			for(Pasto p : tm.getListaPasti()) {
				// devo creare un oggetto VisitorPersona che è un'interface e quindi instanziarlo come una classe concreta (a cui gli passo un pasto)
				VisitorPersona calcoloSuPersona = new OperazioneSuPersona(p);
				// poi chiamo il metodo visitaPersona su un oggetto Persona e gli passo un oggetto instanziato che implementa l'interfaccia VisitorPersona
				tm.getPersona().visitaPersona(calcoloSuPersona);
			}
		}
	}
	
	public void eseguiOperazioneDiCalcoloDiAcquaFruttaSecondoPerOgniPasto() {
		FiltraggioPasti calcoloSeocondi = new CalcolaSecondi(new FiltroMese());
		FiltraggioPasti calcoloAcqua = new CalcolaAcqua(new FiltroMese());
		FiltraggioPasti calcoloFrutta = new CalcolaAcqua(new FiltroMese());
		
		Stampa.stampa("Il totale dell'acqua venduta è: " + calcoloAcqua.calcola(getListaPasti()));
		Stampa.stampa("Il totale della frutta venduta è: " + calcoloFrutta.calcola(getListaPasti()));
		Stampa.stampa("Il totale dei secondi venduti sono: " + calcoloSeocondi.calcola(getListaPasti()));
	}
}