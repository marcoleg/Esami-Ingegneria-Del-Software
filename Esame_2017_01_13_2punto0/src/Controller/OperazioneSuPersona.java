package Controller;

import Model.ConsulenteEsterno;
import Model.Dipendente;
import Model.Pasto;

public class OperazioneSuPersona implements VisitorPersona {
	
	private Pasto pasto;
	
	public OperazioneSuPersona(Pasto pasto) {
		this.pasto = pasto;
	}
	
	@Override
	public void eseguiOperazioneSuPersona(Dipendente dipendente) {
		pasto.visitPasto(new OperazioniSuPastoDipendente());
	}

	@Override
	public void eseguiOperazioneSuPersona(ConsulenteEsterno consulenteEsterno) {
		pasto.visitPasto(new OperazioniSuPastoConsulente());
	}

}
