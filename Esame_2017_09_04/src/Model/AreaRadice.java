package Model;

import java.awt.IllegalComponentStateException;
import java.util.ArrayList;

public class AreaRadice extends Area {

	private ArrayList<Area> listaAreeFiglie;
	
	public AreaRadice(String nomeArea) {
		super(nomeArea);
		this.listaAreeFiglie = new ArrayList<>();
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
		return true;
	}
	
	

}
