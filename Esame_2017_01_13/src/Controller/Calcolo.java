package Controller;

import java.util.ArrayList;

import Model.Pasto;

public abstract class Calcolo implements OperazioneDiCalcoloSuiPasti {
	
	private FiltroTemporale filtroTemporale;

	public Calcolo(FiltroTemporale filtroTemporale) {
		this.filtroTemporale = filtroTemporale;
	}
	
	@Override
	public int calcola(ArrayList<Pasto> listaPastiDaFiltrare) {
		return calcoloEffettivo(filtroTemporale.filtra(listaPastiDaFiltrare));
	}
	
	public abstract int calcoloEffettivo(ArrayList<Pasto> filtrata);
}
