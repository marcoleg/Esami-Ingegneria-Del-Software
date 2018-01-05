package Controller;

import java.util.ArrayList;

import Model.ViaggioVenduto;

public interface FiltroTemporale {

	public ArrayList<ViaggioVenduto> filtra(ArrayList<ViaggioVenduto> listaViaggiDaFiltrare);
	
}
