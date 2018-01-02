package Controller;

import Model.Completo;
import Model.Primo;
import Model.Secondo;

public class OperazioniSuPastoConsulente implements OperazioneSuPasto{

	@Override
	public void eseguiSu(Primo primo) {
		primo.settaCosto(2);
	}

	@Override
	public void eseguiSu(Secondo secondo) {
		secondo.settaCosto(3);
	}

	@Override
	public void eseguiSu(Completo completo) {
		completo.settaCosto(4);
	}

}
