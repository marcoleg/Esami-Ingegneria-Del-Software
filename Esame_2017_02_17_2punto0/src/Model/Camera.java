package Model;

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
	
	
}
