package Controller;


import Model.ConsulenteEsterno;
import Model.Dipendente;

public interface VisitorPersona {

	public void eseguiOperazioneSuPersona(Dipendente dipendente);
	
	public void eseguiOperazioneSuPersona(ConsulenteEsterno consulenteEsterno);
	
}
