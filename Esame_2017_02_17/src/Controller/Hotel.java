package Controller;

import java.util.ArrayList;

import Model.Area;
import Model.Camera;

public class Hotel {
	
	private String nomeHotel;
	private String indirizzo;
	private String telefono;
	private String email;
	private String nomeDirettore;
	private String cognomeDirettore;
	private ArrayList<Camera> listaCamere;
	private ArrayList<Area> listaAree;
	
	public Hotel(String nomeHotel, String indirizzo, String telefono, String nomeDirettore, String cognomeDirettore,String email) {
		this.nomeHotel = nomeHotel;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.email = email;
		this.nomeDirettore = nomeDirettore;
		this.cognomeDirettore = cognomeDirettore;
		this.listaCamere = new ArrayList<Camera>();
		this.listaAree = new ArrayList<Area>();
	}
	
	public void aggiungiCamera(Camera camera) {
		this.listaCamere.add(camera);
	}

	public void aggiungiArea(Area area) {
		this.listaAree.add(area);
	}
}
