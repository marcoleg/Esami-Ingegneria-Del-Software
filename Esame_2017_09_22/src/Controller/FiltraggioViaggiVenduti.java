package Controller;

import java.util.ArrayList;

import Model.ViaggioVenduto;

public abstract class FiltraggioViaggiVenduti implements CalcolaGuadagnoPerLuogo {

	private FiltroTemporale filtroTemporale;
	protected ArrayList<ViaggioVenduto> listaOrdinataEfiltrata;
	
	public FiltraggioViaggiVenduti(FiltroTemporale filtroTemporale) {
		this.filtroTemporale = filtroTemporale;
		this.listaOrdinataEfiltrata = new ArrayList<>();
	}
	
	@Override
	public ArrayList<ViaggioVenduto> calcolaListaOrdinataInBaseAlGuadagno(ArrayList<ViaggioVenduto> listaViaggiDaFiltrare, String luogoCheDevoClassificare) {
		return calcoloEffettivo(filtroTemporale.filtra(listaViaggiDaFiltrare), luogoCheDevoClassificare);
	}

	public abstract ArrayList<ViaggioVenduto> calcoloEffettivo(ArrayList<ViaggioVenduto> listaViaggiFiltrati, String luogoCheDevoClassificare);
}
