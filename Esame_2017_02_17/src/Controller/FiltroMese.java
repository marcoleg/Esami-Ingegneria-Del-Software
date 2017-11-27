package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Camera;
import Model.PrenotazioneCamera;

public class FiltroMese implements FiltroTemporale {

	@Override
	public ArrayList<Camera> filtra(ArrayList<Camera> listaCamere) {
		long ora = new Date().getTime();
		long unMese = 30L * 24L * 60L * 60L * 1000L;
		ArrayList<Camera> filtrata = new ArrayList<Camera>();
		
		for(Camera c : listaCamere)
			for(PrenotazioneCamera pc : c.getListaPrenotazioni())
				if((ora - unMese) < pc.getDataFine() && ora > pc.getDataFine()) // && !filtrata.contains(c))
					filtrata.add(c);
		return filtrata;
	}

}
