package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Libro;
import Model.Prenotazione;

public class CalcolaLibriDisponibili implements Calcolo {

	private Date ora;
	
	public CalcolaLibriDisponibili() {
		this.ora = new Date();
	}


	@Override
	public int esegui(ArrayList<Libro> listaLibriSuCuiCalcolare) {
		int count = 0;
		
		for(Libro libro : listaLibriSuCuiCalcolare)
			if(libro.isDisponibile())
				count++;
		
		return count;
	}

}
