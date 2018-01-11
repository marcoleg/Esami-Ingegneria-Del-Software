package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Libro;
import Model.Prenotazione;

public class FiltroSettimana implements FiltroTemporale {

	private Date ora;
	private Date unaSettimanaFa;
	
	public FiltroSettimana() {
		this.ora = new Date();
		this.unaSettimanaFa = new Date(ora.getTime() - 7L * 24L * 60L * 60L * 1000L);
	}
	
	@Override
	public ArrayList<Libro> filtra(ArrayList<Libro> listaLibriDaFiltrare) {
		ArrayList<Libro> listaFiltrata = new ArrayList<>();
		
		for(Libro libro : listaLibriDaFiltrare)
			for(Prenotazione prenotazione : libro.getListaPrenotazioni())
				if(prenotazione.getDataFine().after(unaSettimanaFa) && prenotazione.getDataFine().before(ora))
					if(!listaFiltrata.contains(libro))
						listaFiltrata.add(libro);
		
		return listaFiltrata;
	}

	@Override
	public String getTempo() {
		return unaSettimanaFa.getDate() + "/" + unaSettimanaFa.getMonth()+1 + "/" + (unaSettimanaFa.getYear()+1900);
	}

}
