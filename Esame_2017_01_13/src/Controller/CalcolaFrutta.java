package Controller;

import java.util.ArrayList;

import Model.Pasto;

public class CalcolaFrutta extends Calcolo {

	public CalcolaFrutta(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
	}

	@Override
	public int calcoloEffettivo(ArrayList<Pasto> filtrata) {
		return filtrata.size();
	}

}
