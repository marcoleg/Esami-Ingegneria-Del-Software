package Controller;

import java.util.ArrayList;

import Model.RaccoltaAlbero;

public abstract class FiltraggioRaccolte implements CalcoloSuRaccolta {

	protected FiltroTemporale filtroTemporale;
	
	
	public FiltraggioRaccolte(FiltroTemporale filtroTemporale) {
		this.filtroTemporale = filtroTemporale;
	}

	@Override
	public int calcola(ArrayList<RaccoltaAlbero> listaRaccolte) {
		return calcoloEffettivo(filtroTemporale.filtra(listaRaccolte));
	}
	
	public abstract int calcoloEffettivo(ArrayList<RaccoltaAlbero> listaFiltrata);

}
