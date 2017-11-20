package Controller;

import Model.Completo;
import Model.Primo;
import Model.Secondo;

public class CalcolaPastoSuConsulente implements OperazioneSuPasto {

	@Override
	public void esegui(Primo primo) {
		primo.settaCosto(2);
	}

	@Override
	public void esegui(Secondo secondo) {
		secondo.settaCosto(3);
	}

	@Override
	public void esegui(Completo completo) {
		completo.settaCosto(4);
	}
	
}
