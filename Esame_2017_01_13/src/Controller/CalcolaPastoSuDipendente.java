package Controller;

import Model.Completo;
import Model.Primo;
import Model.Secondo;

public class CalcolaPastoSuDipendente implements OperazioneSuPasto {

	@Override
	public void esegui(Primo primo) {
		primo.settaCosto(0);
	}

	@Override
	public void esegui(Secondo secondo) {
		secondo.settaCosto(0);
	}

	@Override
	public void esegui(Completo completo) {
		completo.settaCosto(0);
	}
	
}
