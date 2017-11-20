package Controller;

import java.util.ArrayList;

import Model.Pasto;

public class CalcolaAcqua extends Calcolo {

	public CalcolaAcqua(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
	}

	@Override
	public int calcoloEffettivo(ArrayList<Pasto> filtrata) {
		return filtrata.size();
	}

}
