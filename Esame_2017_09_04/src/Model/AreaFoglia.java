package Model;

import java.util.ArrayList;

public class AreaFoglia extends Area {

	private Area padre;
	private ArrayList<Albero> listaAlberi;
	
	public AreaFoglia(String nomeArea, Area padre) {
		super(nomeArea);
		this.listaAlberi = new ArrayList<>();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
	}

	@Override
	public void aggiungiFiglio(Area figlio) {
		throw new IllegalAccessError("Non è possibile aggiungere un figlio ad un'area chiamata " + this.getNomeArea() + " , di tipo foglia!");
	}

	@Override
	public ArrayList<Area> getFigli() {
		throw new IllegalAccessError("Non è possibile restituire un figlio da un'area chiamata " + this.getNomeArea() + " , di tipo foglia!");
	}

	@Override
	public void aggiungiAlbero(Albero albero) {
		this.listaAlberi.add(albero);
	}

	@Override
	public ArrayList<Albero> getListaAlberi() {
		return this.listaAlberi;
	}

	@Override
	public boolean isRadice() {
		return false;
	}

}
