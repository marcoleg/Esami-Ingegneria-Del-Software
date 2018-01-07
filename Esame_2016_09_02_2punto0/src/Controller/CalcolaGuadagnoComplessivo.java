package Controller;

import Model.Biglietto;
import Model.Viaggio;

public class CalcolaGuadagnoComplessivo implements StatisticaGuadagni {

	@Override
	public int calcola(Viaggio viaggio) {
		int temp = 0;
		for (Biglietto biglietto : viaggio.getBigliettiVenduti())
			temp += biglietto.getCostoBiglietto();
		return temp;
	}

}
