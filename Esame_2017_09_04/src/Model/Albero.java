package Model;

import java.util.ArrayList;

import Controller.VisitorAlbero;

public abstract class Albero {

	private String nome;
	private String tipo;
	private int eta;
	private int metriQuadri;
	private ArrayList<RaccoltaAlbero> listaRaccolte;
	
	public Albero(String nome, String tipo, int eta, int metriQuadri) {
		this.nome = nome;
		this.tipo = tipo;
		this.eta = eta;
		this.metriQuadri = metriQuadri;
		this.listaRaccolte = new ArrayList<>();
	}
	
	public void aggiungiRaccolta(RaccoltaAlbero raccolta) {
		this.listaRaccolte.add(raccolta);
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getEta() {
		return eta;
	}

	public int getMetriQuadri() {
		return metriQuadri;
	}
	
	public ArrayList<RaccoltaAlbero> getListaRaccolte(){
		return this.listaRaccolte;
	}
	
	public abstract void visit(VisitorAlbero visitorAlbero);
	
}
