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
		
		area_1_0.aggiungiCamera(suite1);
		area_1_1.aggiungiCamera(suite2);
		area_1_1.aggiungiCamera(suite3);
		area_1_2.aggiungiCamera(cameraNormale1);
		area_1_2.aggiungiCamera(cameraNormale2);
		
		hotel.aggiungiArea(area_1_0);
		hotel.aggiungiArea(area_1_1);
		hotel.aggiungiArea(area_1_2);
		
		cameraNormale1.aggiungiPrenotazione(new PrenotazioneCamera((ora - 2L * giorno), (ora + 2L * giorno)));
		cameraNormale1.aggiungiPrenotazione(new PrenotazioneCamera(ora + 7 * giorno, ora + 9 * giorno));
		cameraNormale2.aggiungiPrenotazione(new PrenotazioneCamera((ora - 1 * giorno), (ora + 5 * giorno)));
		suite2.aggiungiPrenotazione(new PrenotazioneCamera((ora - 6 * giorno), (ora - 3 * giorno)));
		
		System.out.println("Le camere libere sono: " + hotel.calcolaCamereLibere(area_1_0));
		System.out.println("Le camere occupate sono: " + hotel.calcolaCamereOccupate(area_1_0));
		
		System.out.println("Le camere disponibili nell'area 0 sono: " + hotel.calcolareCamereDisponibili(area_1_0));
		System.out.println("Le camere disponibili nell'area 1 sono: " + hotel.calcolareCamereDisponibili(area_1_1));
		System.out.println("Le camere disponibili nell'area 2 sono: " + hotel.calcolareCamereDisponibili(area_1_2));
	}

}
