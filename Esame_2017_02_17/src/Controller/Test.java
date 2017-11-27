package Controller;

import java.util.ArrayList;
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
		
		long ora = new Date().getTime();
		long giorno = 24L * 1L * 60L * 60L * 1000L;
		
		Hotel hotel = new Hotel("Legio Resort","Via del tutto eccezionale", "35729404","Marco","Legittimo","marco@email.com");
		
		Area area_1_0 = new AreaRadice();
		Area area_1_1 = new AreaInterna(area_1_0);
		Area area_1_2 = new AreaFoglia(area_1_1);
		
		Camera suite1 = new CameraSuite(12, 20, 2);
		Camera suite2 = new CameraSuite(13, 20, 2);
		Camera cameraNormale1 = new CameraNormale(18, 10, 4);
		Camera cameraNormale2 = new CameraNormale(19, 10, 5);
		Camera suite3 = new CameraSuite(14, 20, 3);
		
		ArrayList<Camera> tutteLeCamere = new ArrayList<Camera>();
		tutteLeCamere.add(suite1);
		tutteLeCamere.add(suite2);
		tutteLeCamere.add(cameraNormale1);
		tutteLeCamere.add(cameraNormale2);
		tutteLeCamere.add(suite3);
		
		area_1_0.aggiungiCamera(suite1);
		area_1_1.aggiungiCamera(suite2);
		area_1_1.aggiungiCamera(suite3);
		area_1_2.aggiungiCamera(cameraNormale1);
		area_1_2.aggiungiCamera(cameraNormale2);
		
		hotel.aggiungiArea(area_1_0);
		hotel.aggiungiArea(area_1_1);
		hotel.aggiungiArea(area_1_2);
		
		cameraNormale1.aggiungiPrenotazione(new PrenotazioneCamera((ora - 2L * giorno), (ora + 2L * giorno),new ArrayList<OsservatoreSuCamera>()));
		cameraNormale1.aggiungiPrenotazione(new PrenotazioneCamera(ora + 7 * giorno, ora + 9 * giorno,new ArrayList<OsservatoreSuCamera>()));
		cameraNormale2.aggiungiPrenotazione(new PrenotazioneCamera((ora - 10 * giorno), (ora - 5 * giorno),new ArrayList<OsservatoreSuCamera>()));
		suite2.aggiungiPrenotazione(new PrenotazioneCamera((ora - 6 * giorno), (ora - 3 * giorno),new ArrayList<OsservatoreSuCamera>()));
		
		Stampa.Stampa("Le camere libere sono: " + hotel.calcolaCamereLibere(area_1_0));
		Stampa.Stampa("Le camere occupate sono: " + hotel.calcolaCamereOccupate(area_1_0));
		
		Stampa.Stampa("Le camere disponibili nell'area 0 sono: " + hotel.calcolareCamereDisponibili(area_1_0));
		Stampa.Stampa("Le camere disponibili nell'area 1 sono: " + hotel.calcolareCamereDisponibili(area_1_1));
		Stampa.Stampa("Le camere disponibili nell'area 2 sono: " + hotel.calcolareCamereDisponibili(area_1_2));
		
		FiltroTemporale filtroMese = new FiltroMese();
		
		Stampa.Stampa("Il guadagno di tutte le camere �: " + hotel.calcola(tutteLeCamere, new CalcoloGuadagnoSuCamera(filtroMese)));
		Stampa.Stampa("Il guadagno dell'area 0 � di: " + hotel.calcola(area_1_0.getListaCamere(), new CalcoloGuadagnoSuCamera(filtroMese)));
		Stampa.Stampa("Il guadagno dell'area 1 � di: " + hotel.calcola(area_1_1.getListaCamere(), new CalcoloGuadagnoSuCamera(filtroMese)));
		Stampa.Stampa("Il guadagno dell'area 2 � di: " + hotel.calcola(area_1_2.getListaCamere(), new CalcoloGuadagnoSuCamera(filtroMese)));
		
	}

}
