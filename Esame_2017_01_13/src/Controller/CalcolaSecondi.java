package Controller;

import java.util.ArrayList;

import Model.Completo;
import Model.Pasto;
import Model.Primo;
import Model.Secondo;

public class CalcolaSecondi extends Calcolo implements OperazioneSuPasto{
	
	private int numeroSecondi;

	public CalcolaSecondi(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
		this.numeroSecondi = 0;
	}

	@Override
	public int calcoloEffettivo(ArrayList<Pasto> filtrata) {
		for(Pasto p : filtrata) {
			p.visitPasto(this);
		}
		return numeroSecondi;
	}

	@Override
	public void esegui(Primo primo) {
		// non fare niente perchè è un primo
	}

	@Override
	public void esegui(Secondo secondo) {
		this.numeroSecondi++;
	}

	@Override
	public void esegui(Completo completo) {
		// non fare niente perchè è un completo
	}

}
