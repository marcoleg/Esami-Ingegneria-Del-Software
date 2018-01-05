package Controller;

import java.util.ArrayList;
import java.util.Comparator;
import Model.ViaggioVenduto;

public class CalcolaListaOrdinataPerContinente extends FiltraggioViaggiVenduti {

	public CalcolaListaOrdinataPerContinente(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
	}

	@Override
	public ArrayList<ViaggioVenduto> calcoloEffettivo(ArrayList<ViaggioVenduto> listaViaggiFiltrati,
			String luogoCheDevoClassificare) {
		for(ViaggioVenduto viaggio : listaViaggiFiltrati)
			if(viaggio.getPacchettoViaggio().getCitta().getNomeContinente().equals(luogoCheDevoClassificare))
				this.listaOrdinataEfiltrata.add(viaggio);
		return this.listaOrdinataEfiltrata;
	}

}
