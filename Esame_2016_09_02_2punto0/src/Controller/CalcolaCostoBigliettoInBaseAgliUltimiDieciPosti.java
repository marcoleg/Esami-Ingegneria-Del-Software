
package Controller;

import Model.Viaggio;

public class CalcolaCostoBigliettoInBaseAgliUltimiDieciPosti extends CalcoloInBaseAlleDisponibilita {

	public CalcolaCostoBigliettoInBaseAgliUltimiDieciPosti(Viaggio viaggio) {
		super(viaggio);
	}

	@Override
	public int calcola() {
		if(this.numeroPostiRimasti > 10) {
			this.aggiornaPostiRimasti();
			return this.viaggio.getcostoBiglietto();
		}else {
			this.aggiornaPostiRimasti();
			return this.viaggio.getcostoBiglietto() * 2;
		}
	}

}
