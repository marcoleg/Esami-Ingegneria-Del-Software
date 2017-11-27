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
		if(this.listaPrenotazioni.size()==0)
			this.listaPrenotazioni.add(prenotazione);
		else {
			for(PrenotazioneCamera pc : this.listaPrenotazioni) {
				if((pc.getDataInizio() <= prenotazione.getDataFine() && pc.getDataInizio() >= prenotazione.getDataInizio())|| 
				(pc.getDataInizio() >= prenotazione.getDataInizio() && pc.getDataFine() <= prenotazione.getDataFine())||
				(pc.getDataFine() >= prenotazione.getDataInizio() && pc.getDataFine() <= prenotazione.getDataFine())||
				(pc.getDataInizio() >= prenotazione.getDataInizio() && pc.getDataFine() <= prenotazione.getDataFine()))
					throw new IllegalStateException("Non è possibile aggiungere questa camera perchè è prenotata in quel periodo.");				
			}
			this.listaPrenotazioni.add(prenotazione);
		}
	}
	
	public ArrayList<PrenotazioneCamera> getListaPrenotazioni() {
		return this.listaPrenotazioni;
	}

}
