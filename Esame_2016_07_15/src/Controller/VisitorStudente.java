package Controller;

import Model.StudenteNuovoOrdinamento;
import Model.StudenteVecchioOrdinamento;

public interface VisitorStudente {

	public void eseguiSu(StudenteVecchioOrdinamento studenteVecchioOrdinamento);
	
	public void eseguiSu(StudenteNuovoOrdinamento studenteNuovoOrdinamento);
	
}
