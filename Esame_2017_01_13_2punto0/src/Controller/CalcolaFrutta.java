package Controller;

import java.util.ArrayList;

import Model.Pasto;

public class CalcolaFrutta extends FiltraggioPasti {

	private int risultato;
	
	public CalcolaFrutta(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
		risultato = 0;
	}

	@Override
	public int calcoloEffettivo(ArrayList<Pasto> filtrata) {
		for(Pasto p : filtrata)
			risultato++;
		return risultato;
	}

}
