package Model;

import java.util.ArrayList;

public class AreaRadice extends Area {
	
	private ArrayList<Area> listaAreeFiglie;

	public AreaRadice() {
		super();
		this.listaAreeFiglie = new ArrayList<>();
	}

	@Override
	public Area getPadre() {
		throw new IllegalStateException("L'Area radice non può avere un padre!");
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
		
		return numeroCamereTotali - this.calcolaCamereLibere();
	}

	
}
