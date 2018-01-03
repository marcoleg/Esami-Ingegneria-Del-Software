package Controller;


import java.util.ArrayList;
import java.util.Date;

import Model.Pasto;

public class FiltroMese implements FiltroTemporale {

	ArrayList<Pasto> filtrata = new ArrayList<Pasto>();
	Date ora = new Date();
	long unMeseFa = 30L * 24L * 60L * 60L * 1000L;
	
	@Override
	public ArrayList<Pasto> filtra(ArrayList<Pasto> listaPastiDaFiltrare) {
		for(Pasto p : listaPastiDaFiltrare) 
			if(p.getDataPasto().getTime() >= ora.getTime() - unMeseFa)
				filtrata.add(p);
		
		return filtrata;
	}

}
