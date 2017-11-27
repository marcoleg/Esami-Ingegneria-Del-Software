package Model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Area {
	
	protected ArrayList<Camera> listaCamere;
	
	public Area() {
		this.listaCamere = new ArrayList<Camera>();
	}
	
	public void aggiungiCamera(Camera camera) {
		this.listaCamere.add(camera);
	}
	
	public ArrayList<Camera> getListaCamere(){
		return this.listaCamere;
	}
	
	public int calcolaCamereDisponibiliNellArea() {
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
	
	public abstract void aggiungiFiglio(Area figlio);
	public abstract Area getPadre();
	public abstract ArrayList<Area> getFigli();
	public abstract int calcolaCamereOccupate();
	public abstract int calcolaCamereLibere();
	
}
