package Controller;


import java.util.ArrayList;

import Model.Pasto;

public abstract class FiltraggioPasti implements CalcoliSuPasto{

	private FiltroTemporale filtroTemporale;
	ArrayList<Pasto> filtrata;

	public FiltraggioPasti(FiltroTemporale filtroTemporale) {
		this.filtroTemporale = filtroTemporale;
		this.filtrata = new ArrayList<>();
	}
	
	public int calcola(ArrayList<Pasto> listaDaFiltrare){
		filtrata = filtroTemporale.filtra(listaDaFiltrare);
		return calcoloEffettivo(filtrata);
	}
	
	public abstract int calcoloEffettivo(ArrayList<Pasto> filtrata);
	
}
