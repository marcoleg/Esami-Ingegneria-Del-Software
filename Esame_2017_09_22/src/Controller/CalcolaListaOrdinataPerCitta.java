package Controller;

import java.util.ArrayList;

import Model.ViaggioVenduto;

public class CalcolaListaOrdinataPerCitta extends FiltraggioViaggiVenduti {

	public CalcolaListaOrdinataPerCitta(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
	}

	@Override
	public ArrayList<ViaggioVenduto> calcoloEffettivo(ArrayList<ViaggioVenduto> listaViaggiFiltrati,
			String luogoCheDevoClassificare) {
		for(ViaggioVenduto viaggio : listaViaggiFiltrati)
			if(viaggio.getPacchettoViaggio().getCitta().getNomeCitta().equals(luogoCheDevoClassificare))
				this.listaOrdinataEfiltrata.add(viaggio);
		return this.listaOrdinataEfiltrata;
	}

}
