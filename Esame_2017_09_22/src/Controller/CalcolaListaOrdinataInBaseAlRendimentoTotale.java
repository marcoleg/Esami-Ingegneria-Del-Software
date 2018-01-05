package Controller;

import java.util.ArrayList;

import Model.ViaggioVenduto;

public class CalcolaListaOrdinataInBaseAlRendimentoTotale extends Ordinamento {

	@Override
	public ArrayList<ViaggioVenduto> ordina(ArrayList<ViaggioVenduto> listaDaOrdinare) {
		int temp = 0;
		for(int i=0; i < listaDaOrdinare.size(); i++) {
			if(listaDaOrdinare.get(i).getCostoTotaleViaggio() > listaDaOrdinare.get(i+1).getCostoTotaleViaggio())
				this.listaOrdinata.add(listaDaOrdinare.get(i));
		}
		return null;
	}

}
