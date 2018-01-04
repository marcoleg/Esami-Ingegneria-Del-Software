package Controller;

import Model.CameraNormale;
import Model.CameraSuite;

public interface VisitorCamera {

	public void eseguiOperazioneSu(CameraSuite cameraSuite);
	
	public void eseguiOperazioneSu(CameraNormale cameraNormale);
	
}
