package Controller;

import java.util.ArrayList;

import Model.Libro;

public class CalcoloLibriTotali implements Calcolo {

	@Override
	public int esegui(ArrayList<Libro> listaLibriSuCuiCalcolare) {
		return listaLibriSuCuiCalcolare.size();
	}

}
