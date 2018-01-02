package Controller;

import java.util.ArrayList;

import Model.Pasto;
import Model.Persona;
import Model.Team;
import Model.TesseraMensa;

public class Mensa {

	private ArrayList<Persona> listaPersone;
	private ArrayList<TesseraMensa> listaTessereMensa;
	private ArrayList<Team> listaTeam;
	private String nomeMensa;
	
	public Mensa(String nomeMensa) {
		this.listaPersone = new ArrayList<Persona>();
		this.listaTessereMensa = new ArrayList<TesseraMensa>();
		this.listaTeam = new ArrayList<Team>();
		this.nomeMensa = nomeMensa;	
	}
	
	public void aggiungiPersona(Persona persona) {	
		this.listaPersone.add(persona);	
	}
	
	public void aggiungiTessera(TesseraMensa tesseraMensa) {	
		this.listaTessereMensa.add(tesseraMensa);
	}
	
	public void aggiungiPastiATessera(TesseraMensa tessera, ArrayList<Pasto> listaPastiDaAggiungere) {
		for(Pasto p : listaPastiDaAggiungere)
			tessera.aggiungiPastoAllaListaPasti(p);
	}
	
	public void eseguiOperazioniSuQuantoSpendonoLePersone() {
		for(TesseraMensa tm : this.listaTessereMensa) {
			for(Pasto p : tm.getListaPasti()) {
				// devo creare un oggetto VisitorPersona che � un'interface e quindi instanziarlo come una classe concreta (a cui gli passo un pasto)
				VisitorPersona calcoloSuPersona = new OperazioneSuPersona(p);
				// poi chiamo il metodo visitaPersona su un oggetto Persona e gli passo un oggetto instanziato che implementa l'interfaccia VisitorPersona
				tm.getPersona().visitaPersona(calcoloSuPersona);
			}
		}
	}
	
	
}