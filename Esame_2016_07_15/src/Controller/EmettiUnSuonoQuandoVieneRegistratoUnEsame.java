package Controller;

import Model.Esame;
import View.Stampa;

public class EmettiUnSuonoQuandoVieneRegistratoUnEsame implements OperazioneSulContestoEsame {

	@Override
	public void esegui(Esame esame) {
		Stampa.stampa("\nBIP!");
	}

}
