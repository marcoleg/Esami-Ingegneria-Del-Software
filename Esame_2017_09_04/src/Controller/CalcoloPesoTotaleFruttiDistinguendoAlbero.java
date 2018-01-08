package Controller;

import java.util.ArrayList;

import Model.Albero;
import Model.AlberoAnziano;
import Model.AlberoGiovane;
import Model.RaccoltaAlbero;

public class CalcoloPesoTotaleFruttiDistinguendoAlbero extends FiltraggioRaccolte implements VisitorAlbero {

	private int count;
	private Albero albero;
	
	public CalcoloPesoTotaleFruttiDistinguendoAlbero(FiltroTemporale filtroTemporale, Albero albero) {
		super(filtroTemporale);
		this.count = 0;
		this.albero = albero;
	}

	@Override
	public void eseguiSu(AlberoAnziano alberoAnziano) {
		this.count = count * 1;
	}

	@Override
	public void eseguiSu(AlberoGiovane alberoGiovane) {
		this.count = count * 2;
	}

	@Override
	public int calcoloEffettivo(ArrayList<RaccoltaAlbero> listaFiltrata) {
		for(RaccoltaAlbero raccolta : listaFiltrata)
			this.count += raccolta.getPesoFruttiRaccolti();
		albero.visit(this);
		return this.count;
	}

}
