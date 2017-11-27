package Model;

import java.util.ArrayList;
import java.util.Date;

public class AreaFoglia extends Area{

	private Area padre;
	
	public AreaFoglia(Area padre) {
		super();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
	}

	@Override
	public void aggiungiFiglio(Area figlio) {
		throw new IllegalStateException("Una foglia non può avere un'area figlia.");
	}

	@Override
	public Area getPadre() {
		return this.padre;
	}

	@Override
	public ArrayList<Area> getFigli() {
		throw new IllegalStateException("Una foglia non ha aree figlie.");
	}

	@Override
	public int calcolaCamereOccupate() {
		int count = 0;
		long ora = new Date().getTime();
		
		for(Camera c : this.listaCamere)
			for(PrenotazioneCamera pc : c.getListaPrenotazioni())
				if(pc.getDataInizio() <= ora && pc.getDataFine() >= ora)
					count++;
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
		return count;
	}*/

}
