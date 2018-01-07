package Model;

import java.util.ArrayList;

public class GruppoDiInsegnamentoInterno extends GruppoDiInsegnamento {
	
	private ArrayList<GruppoDiInsegnamento> listaSottoGruppi;
	private GruppoDiInsegnamento padre;

	public GruppoDiInsegnamentoInterno(GruppoDiInsegnamento padre) {
		super();
		this.listaEsami = new ArrayList<>();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
	}

	@Override
	public GruppoDiInsegnamento getPadre() {
		return this.padre;
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
