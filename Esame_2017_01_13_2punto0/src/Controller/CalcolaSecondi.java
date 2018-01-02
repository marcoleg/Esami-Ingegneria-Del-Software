package Controller;

import java.util.ArrayList;

import Model.Completo;
import Model.Pasto;
import Model.Primo;
import Model.Secondo;

public class CalcolaSecondi extends FiltraggioPasti implements OperazioneSuPasto {

	private int risultato;
	
	public CalcolaSecondi(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
		risultato = 0;
	}

	@Override
	public void eseguiSu(Primo primo) {
		// TODO Auto-generated method stub
		this.risultato = risultato;
	}

	@Override
	public void eseguiSu(Secondo secondo) {
		// TODO Auto-generated method stub
		this.risultato++;
	}

	@Override
	public void eseguiSu(Completo completo) {
		// TODO Auto-generated method stub
		this.risultato = risultato;
	}

	@Override
	public int calcoloEffettivo(ArrayList<Pasto> filtrata) {
		for(Pasto p : filtrata)
			p.visitPasto(this);
		return risultato;
	}

}
