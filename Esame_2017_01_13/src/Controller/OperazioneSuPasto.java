package Controller;

import Model.Completo;
import Model.Primo;
import Model.Secondo;

public interface OperazioneSuPasto {
	
	public void esegui(Primo primo);
	public void esegui(Secondo secondo);
	public void esegui(Completo completo);
	
}
