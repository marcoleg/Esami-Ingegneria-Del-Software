package Model;

import java.util.ArrayList;

public abstract class Area {

	protected String nomeArea;
	
	public Area(String nomeArea) {
		this.nomeArea = nomeArea;
	}

	public String getNomeArea() {
		return nomeArea;
	}
	
	public abstract void aggiungiFiglio(Area figlio);
	public abstract ArrayList<Area> getFigli();
	public abstract void aggiungiAlbero(Albero albero);
	public abstract ArrayList<Albero> getListaAlberi();
	public abstract boolean isRadice();
	
}
