package Controller;

import java.util.ArrayList;

import Model.Pasto;
import Model.Persona;
import Model.Team;
import Model.TesseraMensa;

public class Mensa {
	
	private ArrayList<Team> listaTeam;
	private ArrayList<Persona> listaPersone;
	private ArrayList<TesseraMensa> listaTessereMensa;
	private ArrayList<OperazioneSulContestoPasto> operazioniSulContesto;
	
	public Mensa() {
		listaTeam = new ArrayList<Team>();
		listaPersone = new ArrayList<Persona>();
		listaTessereMensa = new ArrayList<TesseraMensa>();
		operazioniSulContesto = new ArrayList<OperazioneSulContestoPasto>();
	}
	
	public void aggiungiPersona(Persona persona){
		this.listaPersone.add(persona);
	}
	
	public void aggiungiTeam(Team team) {
		this.listaTeam.add(team);
	}
	
	public void aggiungiTessera(TesseraMensa tesseraMensa) {
		this.listaTessereMensa.add(tesseraMensa);
	}
	
	public void aggiungiOperazioneAllaListaDelleOperazioniDelContesto(OperazioneSulContestoPasto operazione) {
		this.operazioniSulContesto.add(operazione);
	}
	
	public void aggiungiPasto(Pasto pasto, Persona persona) {
		persona.visitTipo(new CalcolaSuPersona(pasto));
		for (TesseraMensa tesseraMensa : this.listaTessereMensa) {
			if(tesseraMensa.getPersona() == persona) {
				tesseraMensa.aggiungiPasto(pasto);
				for(OperazioneSulContestoPasto op : this.operazioniSulContesto)
					op.esegui(tesseraMensa);
			}
		}
		
	}
	
	public int esegui(OperazioneDiCalcoloSuiPasti operazioneCalcoloSuiPasti) {
		ArrayList<Pasto> listaPasto = new ArrayList<Pasto>();
		for(TesseraMensa tm : this.listaTessereMensa) {
			for(Pasto p : tm.getListaPasti())
				listaPasto.add(p);
		}
		return operazioneCalcoloSuiPasti.calcola(listaPasto);
	}
}