package Model;

import java.util.ArrayList;

public class AreaInterna extends Area {
	
	private Area padre;
	private ArrayList<Area> listaAreeFiglie;

	public AreaInterna(Area padre) {
		super();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
		this.listaAreeFiglie = new ArrayList<>();
	}

	@Override
	public Area getPadre() {
		return this.padre;
	}

	@Override
	public ArrayList<Area> getFigli() {
		return this.listaAreeFiglie;
	}

	@Override
	public void aggiungiFiglio(Area figlio) {
		this.listaAreeFiglie.add(figlio);
	}

	@Override
	public int calcolaCamereLibere() {
		int numeroCamereLibereTemporaneo = 0;
		
		for(Camera camera : this.listaCamereDellArea)
			if(camera.eLibera())
				numeroCamereLibereTemporaneo++;
		
		for(Area area : this.listaAreeFiglie)
			numeroCamereLibereTemporaneo += area.calcolaCamereLibere();
		
		return numeroCamereLibereTemporaneo;
	}

	@Override
	public int calcolaCamereOccupate() {
		int numeroCamereTotali = 0;
		
		for(Camera camera : this.getListaCamere())
			numeroCamereTotali++;
		
		for(Area area : this.listaAreeFiglie)
			numeroCamereTotali += area.calcolaCamereOccupate();
		
		return numeroCamereTotali;
	}

}
