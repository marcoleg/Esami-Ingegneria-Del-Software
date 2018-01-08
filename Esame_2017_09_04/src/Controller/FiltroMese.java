package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.RaccoltaAlbero;

public class FiltroMese implements FiltroTemporale {

	private Date ora;
	private Date unMeseFa;
	
	public FiltroMese() {
		this.ora = new Date();
		this.unMeseFa = new Date(ora.getTime() - 30L * 24L * 60L *60L * 1000L);
	}
	
	@Override
	public ArrayList<RaccoltaAlbero> filtra(ArrayList<RaccoltaAlbero> listaRaccolteDaFiltrare) {
		ArrayList<RaccoltaAlbero> listaRaccolteFiltrate = new ArrayList<>();
		for(RaccoltaAlbero raccolta : listaRaccolteDaFiltrare) 
			if(raccolta.getDataFine().after(unMeseFa) && raccolta.getDataFine().before(ora))
				listaRaccolteFiltrate.add(raccolta);
		return listaRaccolteFiltrate;
	}

	@Override
	public String getTempo() {
		return "ULTIMO MESE";
	}

}
