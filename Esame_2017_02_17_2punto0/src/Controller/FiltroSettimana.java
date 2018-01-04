package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Camera;

public class FiltroSettimana implements FiltroTemporale {
	Date ora = new Date();
	long unaSettimana = 7L * 24L * 60L * 60L * 1000L;
	
	@Override
	public ArrayList<Camera> filtra(ArrayList<Camera> listaDaFiltrare) {
		ArrayList<Camera> risultato = new ArrayList<>();
		
		for(Camera camera : listaDaFiltrare) 
			if(camera.getPrenotazione().getDataFine() + unaSettimana > ora.getTime() && camera.getPrenotazione().getDataFine() < ora.getTime())
				risultato.add(camera);
		
		return risultato;
	}

}
