package Model;

import java.util.ArrayList;

public abstract class GruppoDiInsegnamento {

	protected ArrayList<Esame> listaEsami;
	
	public GruppoDiInsegnamento() {
		this.listaEsami = new ArrayList<>();
	}
	
	public void aggiungiEsameAllaListaDegliEsamiDiQuestoGruppo(Esame esame) {
		this.listaEsami.add(esame);
	}
	
	public abstract GruppoDiInsegnamento getPadre();
	public abstract ArrayList<GruppoDiInsegnamento> getFigli();
	public abstract void aggiungiFiglio(GruppoDiInsegnamento figlio);
	
}
