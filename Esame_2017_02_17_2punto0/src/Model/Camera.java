package Model;

import java.util.Date;

public class Camera {

	private int numeroCamera;
	private int numeroPiano;
	private int numeroLetti;
	private PrenotazioneCamera prenotazioneCamera;
	
	public Camera(int numeroCamera, int numeroPiano, int numeroLetti, PrenotazioneCamera prenotazioneCamera) {
		this.numeroCamera = numeroCamera;
		this.numeroPiano = numeroPiano;
		this.numeroLetti = numeroLetti;
		this.prenotazioneCamera = prenotazioneCamera;
	}
	
	public boolean eLibera() {
		Date ora = new Date();
		if(this.prenotazioneCamera.getDataFine() - ora.getTime() > 0 && ora.getTime() - this.prenotazioneCamera.getDataInizio() > 0)
			return false;
		else
			return true;
	}
}
