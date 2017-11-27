package Model;

import java.util.ArrayList;

public abstract class Camera {

	protected int numeroCamera;
	protected int numeroPiano;
	protected int numeroLetti;
	protected ArrayList<PrenotazioneCamera> listaPrenotazioni;

	public Camera(int numeroCamera, int numeroPiano, int numeroLetti) {
		this.numeroCamera = numeroCamera;
		this.numeroPiano = numeroPiano;
		this.numeroLetti = numeroLetti;
		this.listaPrenotazioni = new ArrayList<PrenotazioneCamera>();
	}
	
	public void aggiungiPrenotazione(PrenotazioneCamera prenotazione) {
		this.listaPrenotazioni.add(prenotazione);
	}

}
