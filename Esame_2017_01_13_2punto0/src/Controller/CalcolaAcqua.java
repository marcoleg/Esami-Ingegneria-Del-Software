package Controller;

import java.util.ArrayList;

import Model.Pasto;

public class CalcolaAcqua extends FiltraggioPasti {

	//private int risultato;
	
	public CalcolaAcqua(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
	}

	@Override
	public int calcoloEffettivo(ArrayList<Pasto> filtrata) {
		int risultato = 0;
		for(Pasto p : filtrata)
			risultato++;
		return risultato;
	}

}
