package Controller;

import java.util.ArrayList;

import Model.RaccoltaAlbero;

public interface FiltroTemporale {

	public ArrayList<RaccoltaAlbero> filtra(ArrayList<RaccoltaAlbero> listaRaccolteDaFiltrare);
	public String getTempo();
	
}
