package Model;

import java.util.ArrayList;

public class LibrettoElettronico {

	private ArrayList<GruppoDiInsegnamento> listaGruppiDiInsegnamento;
	
	public LibrettoElettronico() {
		this.listaGruppiDiInsegnamento = new ArrayList<>();
	}
	
	public void aggiungiGruppoDinsegnamento(GruppoDiInsegnamento gruppo) {
		this.listaGruppiDiInsegnamento.add(gruppo);
	}
}
