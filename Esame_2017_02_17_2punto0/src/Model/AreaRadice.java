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

	
}
