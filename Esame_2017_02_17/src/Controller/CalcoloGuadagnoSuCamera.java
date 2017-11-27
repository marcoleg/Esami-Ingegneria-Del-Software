package Controller;

import java.util.ArrayList;

import Model.Camera;
import Model.CameraNormale;
import Model.CameraSuite;

public class CalcoloGuadagnoSuCamera extends FiltraggioCamera implements OperazioneSuCamera  {

	private int guadagno;
	
	public CalcoloGuadagnoSuCamera(FiltroTemporale filtro) {
		super(filtro);
		this.guadagno = 0;
	}
	
	@Override
	public void eseguiSu(CameraSuite suite) {
		this.guadagno++;
		this.guadagno++;
	}

	@Override
	public void eseguiSu(CameraNormale cameraNormale) {
		this.guadagno++;
	}

	@Override
	public int calcoloEffettivo(ArrayList<Camera> filtrata) {
		for(Camera c: filtrata)
			c.visit(this);
		return this.guadagno;
	}

}
