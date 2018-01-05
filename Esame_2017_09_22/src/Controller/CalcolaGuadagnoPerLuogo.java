package Controller;

import java.util.ArrayList;

import Model.ViaggioVenduto;

public interface CalcolaGuadagnoPerLuogo {

	public ArrayList<ViaggioVenduto> calcolaListaOrdinataInBaseAlGuadagno(ArrayList<ViaggioVenduto> listaViaggiDaFiltrare, String luogoCheDevoClassificare);
	
}
