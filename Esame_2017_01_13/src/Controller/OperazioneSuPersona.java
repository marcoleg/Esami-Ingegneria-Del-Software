package Controller;

import Model.Consulente;
import Model.Dipendente;

public interface OperazioneSuPersona {

	public void esegui(Consulente consulente);
	
	public void esegui(Dipendente dipendente);
	
}
