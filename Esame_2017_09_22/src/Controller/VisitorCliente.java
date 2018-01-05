package Controller;

import Model.Adulto;
import Model.Bambino;
import Model.PacchettoViaggio;

public interface VisitorCliente {

	public void eseguiSu(Adulto adulto);
	
	public void eseguiSu(Bambino bambino);
}
