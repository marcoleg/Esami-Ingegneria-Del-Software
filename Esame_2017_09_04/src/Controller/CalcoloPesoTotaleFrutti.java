package Controller;

import java.util.ArrayList;

import Model.RaccoltaAlbero;

public class CalcoloPesoTotaleFrutti extends FiltraggioRaccolte {

	public CalcoloPesoTotaleFrutti(FiltroTemporale filtroTemporale) {
		super(filtroTemporale);
	}

	@Override
	public int calcoloEffettivo(ArrayList<RaccoltaAlbero> listaFiltrata) {
		int temp = 0;
		for(RaccoltaAlbero raccola : listaFiltrata)
			temp += raccola.getPesoFruttiRaccolti();
		return temp;
	}

}
