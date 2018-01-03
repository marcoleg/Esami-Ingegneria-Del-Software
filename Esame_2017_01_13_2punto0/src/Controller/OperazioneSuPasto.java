package Controller;


import Model.Completo;
import Model.Primo;
import Model.Secondo;

public interface OperazioneSuPasto {

	public void eseguiSu(Primo primo);
	
	public void eseguiSu(Secondo secondo);
	
	public void eseguiSu(Completo completo);
	
}
