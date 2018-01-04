package Model;

import java.awt.IllegalComponentStateException;
import java.util.ArrayList;

public class AreaFoglia extends Area {
	
	private Area padre;

	public AreaFoglia(Area padre) {
		super();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
	}

	@Override
	public Area getPadre() {
		return this.padre;
	}

	@Override
	public ArrayList<Area> getFigli() {
		throw new IllegalComponentStateException("Un'Area foglia non può avere figli!");
	}

	@Override
	public void aggiungiFiglio(Area figlio) {
		throw new IllegalComponentStateException("Un'Area foglia non può avere figli!");
	}

}
