package Controller;

import java.awt.IllegalComponentStateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import Model.Albero;
import Model.AlberoAnziano;
import Model.AlberoGiovane;
import Model.Area;
import Model.AreaFoglia;
import Model.AreaInterna;
import Model.AreaRadice;
import Model.RaccoltaAlbero;
import View.Stampa;

public class AziendaAgricola {

	private ArrayList<Area> listaAree;
	private String nomeAzienda;
	private ArrayList<OperazioneSulContestoRaccolta> listaOperazioniSulContestoRaccolta;
	
	public AziendaAgricola(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
		this.listaAree = new ArrayList<>();
		this.listaOperazioniSulContestoRaccolta = new ArrayList<>();
	}
	
	public void aggiungiOperazioniAlleOperazioniSulContestoRaccolta(OperazioneSulContestoRaccolta operazione) {
		this.listaOperazioniSulContestoRaccolta.add(operazione);
	}
	
	private Area getAreaRadice() {
		for(Area area : this.listaAree)
			if(area.isRadice())
				return area;
		throw new IllegalStateException("Non c'è un'area radice tra le aree dell'azienda");
		
	}
	
	public AlberoAnziano creaAlberoAnziano(String nome, String tipo, int eta, int metriQuadri) {
		return new AlberoAnziano(nome, tipo, eta, metriQuadri);
	}

	public AlberoGiovane creaAlberoGiovane(String nome, String tipo, int eta, int metriQuadri) {
		return new AlberoGiovane(nome, tipo, eta, metriQuadri);
	}
	
	public RaccoltaAlbero creaRaccolta(Albero albero, Date dataInizio, Date dataFine, int pesoFruttiRaccolti) {
		RaccoltaAlbero raccolta = new RaccoltaAlbero(dataInizio, dataFine, pesoFruttiRaccolti);
		albero.aggiungiRaccolta(raccolta);
		for(OperazioneSulContestoRaccolta operazione : this.listaOperazioniSulContestoRaccolta)
			operazione.esegui(raccolta);
		return raccolta;
	}
	
	public AreaRadice creaAreaRadice(String nomeArea) {
		AreaRadice areaRadice = new AreaRadice(nomeArea);
		this.listaAree.add(areaRadice);
		return areaRadice;
	}
	
	public AreaInterna creaAreaInterna(String nomeArea, Area padre) {
		AreaInterna areaInterna = new AreaInterna(nomeArea, padre);
		this.listaAree.add(areaInterna);
		return areaInterna;
	}
	
	public AreaFoglia creaAreaFoglia(String nomeArea, Area padre) {
		AreaFoglia areaFoglia = new AreaFoglia(nomeArea, padre);
		this.listaAree.add(areaFoglia);
		return areaFoglia;
	}
	
	public void aggiungiAlberoAdArea(Area area, Albero albero) {
		area.aggiungiAlbero(albero);
	}
	
	public void stampaClassificaAlberiMiglioriSuPeriodo(FiltroTemporale filtroTemporale) {
		ArrayList<Albero> listaAlberi = this.getAreaRadice().getListaAlberi();
		ArrayList<Integer> listaPesiTotali = new ArrayList<>();
		CalcoloSuRaccolta calcoloPesoTotaleSuFrutti = new CalcoloPesoTotaleFrutti(filtroTemporale);
		
		for(Albero albero : listaAlberi) 
			listaPesiTotali.add(calcoloPesoTotaleSuFrutti.calcola(albero.getListaRaccolte()));
		
		ArrayList<Integer> listaCopiaPesiTotali = new ArrayList<>();
		for(int i=0; i < listaPesiTotali.size(); i++)
			listaCopiaPesiTotali.add(listaPesiTotali.get(i));
		
		Collections.sort(listaPesiTotali);
		Collections.reverse(listaPesiTotali);
		
		Stampa.stampa("\n-------- CLASSIFICA NEL PERIODO " + filtroTemporale.getTempo() + " -----------------\n");
		for(int i=0; i < listaAlberi.size(); i++)
			Stampa.stampa(i+1 + ") " + listaAlberi.get(listaCopiaPesiTotali.indexOf(listaPesiTotali.get(i))).getNome() + " - peso totale: " + listaCopiaPesiTotali.get(listaCopiaPesiTotali.indexOf(listaPesiTotali.get(i))));
	}
	
	public void stampaClassificaAlberiMiglioriSuPeriodoInBaseAlTipo(FiltroTemporale filtroTemporale) {
		ArrayList<Albero> listaAlberi = this.getAreaRadice().getListaAlberi();
		ArrayList<Integer> listaPesiTotali = new ArrayList<>();
		
		
		for(Albero albero : listaAlberi) {
			CalcoloSuRaccolta calcoloPesoTotaleSuFruttiDistinguendoTipo = new CalcoloPesoTotaleFruttiDistinguendoAlbero(filtroTemporale, albero);
			listaPesiTotali.add(calcoloPesoTotaleSuFruttiDistinguendoTipo.calcola(albero.getListaRaccolte()));
		}
		
		ArrayList<Integer> listaCopiaPesiTotali = new ArrayList<>();
		for(int i=0; i < listaPesiTotali.size(); i++)
			listaCopiaPesiTotali.add(listaPesiTotali.get(i));
		
		Collections.sort(listaPesiTotali);
		Collections.reverse(listaPesiTotali);
		
		Stampa.stampa("\n-------- CLASSIFICA NEL PERIODO " + filtroTemporale.getTempo() + " -----------------\n");
		for(int i=0; i < listaAlberi.size(); i++)
			Stampa.stampa(i+1 + ") " + listaAlberi.get(listaCopiaPesiTotali.indexOf(listaPesiTotali.get(i))).getNome() + " - peso totale: " + listaCopiaPesiTotali.get(listaCopiaPesiTotali.indexOf(listaPesiTotali.get(i))));
	}
	
}
