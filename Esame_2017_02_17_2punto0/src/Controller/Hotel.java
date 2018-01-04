package Controller;

import java.util.ArrayList;

import Model.Area;
import Model.Camera;

public class Hotel {

	private String nomeHotel;
	private String nomeDirettore;
	private long numeroHotel;
	private String emailHotel;
	private String indirizzo;
	private ArrayList<Area> listaAree;
	
	public Hotel(String nomeHotel, String nomeDirettore, long numeroHotel, String emailHotel, String indirizzo) {
		this.nomeHotel = nomeHotel;
		this.nomeDirettore = nomeDirettore;
		this.numeroHotel = numeroHotel;
		this.emailHotel = emailHotel;
		this.indirizzo = indirizzo;
		this.listaAree = new ArrayList<>();
	}
	
	public void aggiungiAreaAllaListaDelleAree(Area area) {
		this.listaAree.add(area);
	}
	
	public void aggiungiCameraAllArea(Camera camera, Area area) {
		for(int i=0; i<area.getListaCamere().size(); i++) {
			if(area.getListaCamere().get(i) == camera) {
				throw new IllegalStateException("Non è possibile aggiungere la stessa camera due volte");
			}
		}
		area.aggiungiCameraAllaListaDelleCamere(camera);
	}
	
}
