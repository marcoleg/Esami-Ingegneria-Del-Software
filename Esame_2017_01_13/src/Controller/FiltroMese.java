package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Pasto;

public class FiltroMese implements FiltroTemporale {
	
	private long durataMeseMillisecondi = 30L * 24L * 60L * 60L * 1000L ;
	private long ora = new Date().getTime();
	
	@Override
	public ArrayList<Pasto> filtra(ArrayList<Pasto> pastiDaFiltrare) {
		ArrayList<Pasto> pastiFiltrati = new ArrayList<Pasto>();
		
		for(Pasto p : pastiDaFiltrare) {
			if((p.getData() + durataMeseMillisecondi) >= ora) {
				pastiFiltrati.add(p);
			}
		}
		return pastiFiltrati;
	}

}
