package Controller;

import Model.CameraNormale;
import Model.CameraSuite;

public class OperazioneDiSettaggioCostoCamere implements VisitorCamera {

	@Override
	public void eseguiOperazioneSu(CameraSuite cameraSuite) {
		cameraSuite.setGuadagno(200);
	}

	@Override
	public void eseguiOperazioneSu(CameraNormale cameraNormale) {
		cameraNormale.setGuadagno(100);
	}

}
