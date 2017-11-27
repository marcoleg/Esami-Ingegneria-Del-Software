package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Area;
import Model.Camera;
import Model.PrenotazioneCamera;

public class Hotel {
	
	private String nomeHotel;
	private String indirizzo;
	private String telefono;
	private String email;
	private String nomeDirettore;
	private String cognomeDirettore;
	private ArrayList<Area> listaAree;
	
	public Hotel(String nomeHotel, String indirizzo, String telefono, String nomeDirettore, String cognomeDirettore,String email) {
		this.nomeHotel = nomeHotel;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.email = email;
		this.nomeDirettore = nomeDirettore;
		this.cognomeDirettore = cognomeDirettore;
		this.listaAree = new ArrayList<Area>();
	}

	public void aggiungiArea(Area area) {
		this.listaAree.add(area);
	}
	
	public int calcolaCamereLibere(Area area) {
		return area.calcolaCamereLibere();
	}
	
	public int calcolaCamereOccupate(Area area) {
		return area.calcolaCamereOccupate();
	}
	
	public int calcolareCamereDisponibili(Area area) {
		return area.calcolaCamereDisponibiliNellArea();
	}
}
