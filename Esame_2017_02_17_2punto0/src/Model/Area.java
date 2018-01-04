package Model;

import java.util.ArrayList;

public abstract class Area {

	protected ArrayList<Camera> listaCamereDellArea;

	public Area() {
		this.listaCamereDellArea = new ArrayList<>();
	}
	
	public void aggiungiCameraAllaListaDelleCamere(Camera camera) {
		this.listaCamereDellArea.add(camera);
	}
	
	public ArrayList<Camera> getListaCamere(){
		return this.listaCamereDellArea;
	}
	
	public abstract Area getPadre();
	public abstract ArrayList<Area> getFigli();
	public abstract void aggiungiFiglio(Area figlio);
	public abstract int calcolaCamereLibere();
	public abstract int calcolaCamereOccupate();
	
}
