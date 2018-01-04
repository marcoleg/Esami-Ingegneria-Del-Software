package Controller;

import java.util.ArrayList;

import Model.Camera;

public abstract class FiltraggioCamera implements CalcoloSuCamera {

	private FiltroTemporale filtroTemporale;
	
	public FiltraggioCamera(FiltroTemporale filtroTemporale) {
		this.filtroTemporale = filtroTemporale;
	}
	
	@Override
	public int calcola(ArrayList<Camera> listaCamere) {
		return calcoloEffettivo(filtroTemporale.filtra(listaCamere));
	}
	
	public abstract int calcoloEffettivo(ArrayList<Camera> listaCamereFiltrate);

}
