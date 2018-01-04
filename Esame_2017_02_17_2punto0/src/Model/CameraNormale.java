package Model;

import Controller.VisitorCamera;

public class CameraNormale extends Camera {

	public CameraNormale(int numeroCamera, int numeroPiano, int numeroLetti, PrenotazioneCamera prenotazioneCamera) {
		super(numeroCamera, numeroPiano, numeroLetti, prenotazioneCamera);
	}

	@Override
	public void visitCamera(VisitorCamera visitorCamera) {
		visitorCamera.eseguiOperazioneSu(this);
	}

	@Override
	public void setGuadagno(int guadagno) {
		this.guadagno = guadagno;
	}
	
}
