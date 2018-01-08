package Model;

import java.awt.IllegalComponentStateException;
import java.util.ArrayList;

public class AreaInterna extends Area {
	
	private ArrayList<Area> listaAreeFiglie;
	private Area padre;

	public AreaInterna(String nomeArea, Area padre) {
		super(nomeArea);
		this.listaAreeFiglie = new ArrayList<>();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
	}

	@Override
	public void aggiungiFiglio(Area figlio) {
		this.listaAreeFiglie.add(figlio);
	}

	@Override
	public ArrayList<Area> getFigli() {
		return this.listaAreeFiglie;
	}

	@Override
	public void aggiungiAlbero(Albero albero) {
		throw new IllegalComponentStateException("Non è possibile aggiungere un albero ad un'area" + this.getNomeArea() + " non foglia!");
	}

	@Override
	public ArrayList<Albero> getListaAlberi() {
		ArrayList<Albero> listaAlberiArea = new ArrayList<>();
		for(Area area : this.listaAreeFiglie)
			listaAlberiArea.addAll(area.getListaAlberi());
		return listaAlberiArea;
	}

	@Override
	public boolean isRadice() {
		return false;
	}

}
