package Model;

import java.util.ArrayList;
import java.util.Date;

public class AreaInterna extends Area{

	private ArrayList<Area> sottoAree;
	private Area padre;
	
	public AreaInterna(Area padre) {
		super();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
		this.sottoAree = new ArrayList<Area>();
	}

	@Override
	public void aggiungiFiglio(Area figlio) {
		this.sottoAree.add(figlio);
	}

	@Override
	public Area getPadre() {
		return this.padre;
	}

	@Override
	public ArrayList<Area> getFigli() {
		return this.sottoAree;
	}

	@Override
	public int calcolaCamereOccupate() {
		int count = 0;
		long ora = new Date().getTime();
		
		for(Area a : this.sottoAree) {
			for(Camera c : this.listaCamere)
				for(PrenotazioneCamera pc : c.getListaPrenotazioni())
					if(pc.getDataInizio() <= ora && pc.getDataFine() >= ora)
						count++;
			count += a.calcolaCamereOccupate();
		}
		return count;
	}
	
	@Override
	public int calcolaCamereLibere() {
		int count = 0;
		long ora = new Date().getTime();
		
		for (Camera c : this.listaCamere) {
			count++;
			for(PrenotazioneCamera p : c.getListaPrenotazioni()) {
				if(p.getDataInizio() <= ora && p.getDataFine() >= ora)
					count --;
			}
		}	
		for (Area a : sottoAree)
			count += a.calcolaCamereLibere();
		
		return count;
	}

	/*
	@Override
	public int calcolaCamereLibere() {
		int count = 0;
		long ora = new Date().getTime();
		
		for(Camera c : this.listaCamere) {
			if(c.getListaPrenotazioni().isEmpty())
				count++;
			else {
				for(PrenotazioneCamera pc : c.getListaPrenotazioni()) 
					if((pc.getDataInizio() > ora ) || (pc.getDataFine() < ora))
						count++;
			}	
		}
		for(Area a : this.sottoAree) 
			count += a.calcolaCamereLibere();
		
		return count;
	}*/
	
	
}
