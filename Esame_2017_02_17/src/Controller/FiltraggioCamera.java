package Controller;

import java.util.ArrayList;

import Model.Camera;

public abstract class FiltraggioCamera implements CalcoloSuCamera{
	
	private FiltroTemporale filtro;

	public FiltraggioCamera(FiltroTemporale filtro) {
		this.filtro = filtro;
	}
	
	public int calcola(ArrayList<Camera> listaCamere) {
		ArrayList<Camera> filtrata = new ArrayList<Camera>();
		filtrata = filtro.filtra(listaCamere);
		return calcoloEffettivo(filtrata);
	}
	
	public abstract int calcoloEffettivo(ArrayList<Camera> filtrata);
	
}
