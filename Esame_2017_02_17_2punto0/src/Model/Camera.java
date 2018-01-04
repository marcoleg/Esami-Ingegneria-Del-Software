package Model;

import java.util.Date;

import Controller.VisitorCamera;

public abstract class Camera {

	private int numeroCamera;
	private int numeroPiano;
	private int numeroLetti;
	private PrenotazioneCamera prenotazioneCamera;
	protected int guadagno;
	
	public Camera(int numeroCamera, int numeroPiano, int numeroLetti, PrenotazioneCamera prenotazioneCamera) {
		this.numeroCamera = numeroCamera;
		this.numeroPiano = numeroPiano;
		this.numeroLetti = numeroLetti;
		this.prenotazioneCamera = prenotazioneCamera;
		this.guadagno = 0;
	}
	
	public boolean eLibera() {
		Date ora = new Date();
		if(this.prenotazioneCamera.getDataFine() - ora.getTime() > 0 && ora.getTime() - this.prenotazioneCamera.getDataInizio() > 0)
			return false;
		else
			return true;
	}
	
	public PrenotazioneCamera getPrenotazione() {
		return this.prenotazioneCamera;
	}
	
	public int getGuadagno() {
		return this.guadagno;
	}
	
	public abstract void setGuadagno(int guadagno);
	public abstract void visitCamera(VisitorCamera visitorCamera);
}
