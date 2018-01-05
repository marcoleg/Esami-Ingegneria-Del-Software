package Controller;

import java.util.Date;

import Model.Area;
import Model.AreaFoglia;
import Model.AreaInterna;
import Model.AreaRadice;
import Model.Camera;
import Model.CameraNormale;
import Model.CameraSuite;
import Model.PrenotazioneCamera;
import View.Stampa;

public class Test {

	public static void main(String[] args) {

		Hotel hotelHilton = new Hotel("Hilton", "Legittimo", 0210104565, "hiltonHotel@info.it", "Via dei Ricchi 2 bis");
		
		long unGiorno = 1L * 24L * 60L * 60L * 1000L;
		long unaSettimana = 7L * 24L * 60L * 60L * 1000L;
		long unMese = 30L * 24L * 60L * 60L * 1000L;
		long dueMesi = 30L * 24L * 60L * 60L * 1000L;
		Date ora = new Date();
		
		PrenotazioneCamera prenotazione1 = new PrenotazioneCamera(ora.getTime() - unaSettimana, ora.getTime() + unaSettimana);
		Camera camera1 = new CameraNormale(1, 0, 2, prenotazione1);
		
		PrenotazioneCamera prenotazione2 = new PrenotazioneCamera(ora.getTime() - 2 * unaSettimana, ora.getTime() - unaSettimana + unGiorno);
		Camera camera2 = new CameraSuite(2, 0, 3, prenotazione2);
		
		PrenotazioneCamera prenotazione3 = new PrenotazioneCamera(ora.getTime() - 2 * unaSettimana, ora.getTime() - unaSettimana + unGiorno);
		Camera camera3 = new CameraSuite(3, 1, 3, prenotazione3);
		
		PrenotazioneCamera prenotazione4 = new PrenotazioneCamera(ora.getTime() - unaSettimana, ora.getTime() + unaSettimana);
		Camera camera4 = new CameraNormale(4, 2, 2, prenotazione4);
		
		Area area1 = new AreaRadice();
		Area area2 = new AreaInterna(area1);
		Area area3 = new AreaFoglia(area2);
		
		hotelHilton.aggiungiCameraAllArea(camera1, area1);
		hotelHilton.aggiungiCameraAllArea(camera2, area1);
		hotelHilton.aggiungiCameraAllArea(camera3, area2);
		hotelHilton.aggiungiCameraAllArea(camera4, area3);

		hotelHilton.aggiungiAreaAllaListaDelleAree(area1);
		hotelHilton.aggiungiAreaAllaListaDelleAree(area2);
		hotelHilton.aggiungiAreaAllaListaDelleAree(area3);
		
		camera1.visitCamera(new OperazioneDiSettaggioCostoCamere());
		camera2.visitCamera(new OperazioneDiSettaggioCostoCamere());
		camera3.visitCamera(new OperazioneDiSettaggioCostoCamere());
		camera4.visitCamera(new OperazioneDiSettaggioCostoCamere());
		
		FiltroTemporale filtroSettimanale = new FiltroSettimana();
		FiltraggioCamera calcoloGuadagniUltimaSettimana = new CalcoloGuadagnoCamereNormaliESuite(filtroSettimanale);
		
		Stampa.stampa("Il guadagno dell'Hotel nell'ultima settimana è stato di: " + calcoloGuadagniUltimaSettimana.calcola(hotelHilton.getListaCamere()));
		
		Stampa.stampa("Le camere libere nell'Hotel sono: " + area1.calcolaCamereLibere());
		Stampa.stampa("Le camere occupate nell'Hotel sono: " + area1.calcolaCamereOccupate());
		Stampa.stampa("Le camere libere nell'Area 2 sono: " + area2.calcolaCamereLibere());
		
		// se un'interfaccia è implementata da una classe astratta che è estesa da una classe concreta, allora posso istanziare la classe concreta come:
		// INTERFACCIA nomeVariabile = new CLASSECONCRETA();

	}

}
