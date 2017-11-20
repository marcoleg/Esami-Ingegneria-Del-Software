package Controller;

import Model.Consulente;
import Model.Dipendente;
import Model.Pasto;

public class CalcolaSuPersona implements OperazioneSuPersona {
	
	private Pasto pasto;
	
	public CalcolaSuPersona(Pasto pasto) {
		this.pasto = pasto;
	}

	@Override
	public void esegui(Consulente consulente) {
		pasto.visitPasto(new CalcolaPastoSuConsulente());
	}

	@Override
	public void esegui(Dipendente dipendente) {
		pasto.visitPasto(new CalcolaPastoSuDipendente());
	}

}
