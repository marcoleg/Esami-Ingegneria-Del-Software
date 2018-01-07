package Model;

import java.util.ArrayList;

public class GruppoDiInsegnamentoFoglia extends GruppoDiInsegnamento {

	private GruppoDiInsegnamento padre;
	
	public GruppoDiInsegnamentoFoglia(GruppoDiInsegnamento padre) {
		super();
		this.padre = padre;
		this.getPadre().aggiungiFiglio(this);
	}

	@Override
	public GruppoDiInsegnamento getPadre() {
		return this.padre;
	}

	@Override
	public ArrayList<GruppoDiInsegnamento> getFigli() {
		throw new IllegalStateException("Un esame foglia non può avere figli!");
	}

	@Override
	public void aggiungiFiglio(GruppoDiInsegnamento figlio) {
		throw new IllegalStateException("Un esame foglia non può avere figli!");
	}

}
