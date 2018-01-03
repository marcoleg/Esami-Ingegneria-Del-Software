package Controller;


import Model.Completo;
import Model.Primo;
import Model.Secondo;
import View.Stampa;

public class OperazioniSuPastoDipendente implements OperazioneSuPasto {

	@Override
	public void eseguiSu(Primo primo) {
		primo.settaCosto(0);
	}

	@Override
	public void eseguiSu(Secondo secondo) {
		secondo.settaCosto(0);
	}

	@Override
	public void eseguiSu(Completo completo) {
		completo.settaCosto(0);
	}

}
