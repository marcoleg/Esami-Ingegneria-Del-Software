package Controller;

import Model.ConsulenteEsterno;
import Model.Dipendente;
import Model.Persona;
import Model.TesseraMensa;
import View.Stampa;

public class StampareNomeUtentePerOgniPasto implements OperazioneSulContestoPasto, VisitorPersona {

	@Override
	public void esegui(TesseraMensa tesseraMensa) {
		Stampa.stampaNonACapo("Sono " + tesseraMensa.getPersona().getNomeECognome() + " e sono un");
		tesseraMensa.getPersona().visitaPersona(this);
	}

	@Override
	public void eseguiOperazioneSuPersona(Dipendente dipendente) {
		Stampa.stampa(" dipendente");
	}

	@Override
	public void eseguiOperazioneSuPersona(ConsulenteEsterno consulenteEsterno) {
		Stampa.stampa(" consulente esterno");
	}

}
