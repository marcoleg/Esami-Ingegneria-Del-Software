package Controller;

import java.util.ArrayList;

import Model.ViaggioVenduto;

public abstract class Ordinamento {

	protected ArrayList<ViaggioVenduto> listaOrdinata;
	
	public Ordinamento() {
		this.listaOrdinata = new ArrayList<>();
	}
	
	public abstract ArrayList<ViaggioVenduto> ordina(ArrayList<ViaggioVenduto> listaDaOrdinare);
	
}
