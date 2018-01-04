package Controller;

import java.util.ArrayList;

import Model.Camera;
import Model.CameraNormale;
import Model.CameraSuite;

public class CalcoloGuadagnoCamereNormaliESuite extends FiltraggioCamera implements VisitorCamera{

	private int guadagnoComplessivo;
	
	public CalcoloGuadagnoCamereNormaliESuite(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
		this.guadagnoComplessivo = 0;
	}

	@Override
	public int calcoloEffettivo(ArrayList<Camera> listaCamereFiltrate) {
		for(Camera camera : listaCamereFiltrate)
			camera.visitCamera(this);
		return guadagnoComplessivo;
	}

	@Override
	public void eseguiOperazioneSu(CameraSuite cameraSuite) {
		this.guadagnoComplessivo += 200;
	}

	@Override
	public void eseguiOperazioneSu(CameraNormale cameraNormale) {
		this.guadagnoComplessivo += 100;
	}

}
