package Controller;

import Model.ViaggioVenduto;

public class Agenzia {

	public void stampaCostoTotaleInBaseAlNumeroDiPersone(OperazioneDiCalcoloCostoSuViaggio operazione, ViaggioVenduto viaggioVenduto) {
		viaggioVenduto.stampaCostoTotaleInBaseAlNumeroDiPersone(operazione);
	}
}
