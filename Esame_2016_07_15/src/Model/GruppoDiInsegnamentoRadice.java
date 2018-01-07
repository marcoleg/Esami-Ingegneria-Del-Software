package Model;

import java.util.ArrayList;

public class GruppoDiInsegnamentoRadice extends GruppoDiInsegnamento{

	private ArrayList<GruppoDiInsegnamento> listaSottoGruppi;

	public GruppoDiInsegnamentoRadice() {
		super();
		this.listaSottoGruppi = new ArrayList<>();
	}

	@Override
	public GruppoDiInsegnamento getPadre() {
		throw new IllegalStateException("Un esame radice non può avere un padre!");
	}

	@Override
	public ArrayList<GruppoDiInsegnamento> getFigli() {
		return this.listaSottoGruppi;
	}

	@Override
	public void aggiungiFiglio(GruppoDiInsegnamento figlio) {
		this.listaSottoGruppi.add(figlio);
	}
	
	
}
