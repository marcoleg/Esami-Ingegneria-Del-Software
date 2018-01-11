package Controller;

import java.util.ArrayList;

import Model.Libro;

public interface FiltroTemporale {

	public ArrayList<Libro> filtra (ArrayList<Libro> listaLibriDaFiltrare);
	
	public String getTempo();
}
