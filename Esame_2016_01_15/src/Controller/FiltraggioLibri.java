package Controller;

import java.util.ArrayList;

import Model.Libro;

public abstract class FiltraggioLibri implements Calcolo {

	protected FiltroTemporale filtroTemporale;

	public FiltraggioLibri(FiltroTemporale filtroTemporale) {
		this.filtroTemporale = filtroTemporale;
	}

	@Override
	public int esegui(ArrayList<Libro> listaLibriSuCuiCalcolare) {
		return calcoloEffettivo(this.filtroTemporale.filtra(listaLibriSuCuiCalcolare));
	}
	
	public abstract int calcoloEffettivo(ArrayList<Libro> listaFiltrata);

}
