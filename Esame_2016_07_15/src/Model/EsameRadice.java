package Model;

import java.util.ArrayList;

public class EsameRadice extends Esame{

	private ArrayList<Esame> listaEsamiFigli;

	public EsameRadice(String nomeCorso, String cognomeProfessore, AppelloDesame appelloDesame) {
		super(cognomeProfessore, cognomeProfessore, appelloDesame);
		this.listaEsamiFigli = new ArrayList<>();
	}

	@Override
	public Esame getPadre() {
		throw new IllegalStateException("Un esame radice non può avere un padre!");
	}

	@Override
	public ArrayList<Esame> getFigli() {
		return this.listaEsamiFigli;
	}

	@Override
	public void aggiungiFiglio(Esame figlio) {
		this.listaEsamiFigli.add(figlio);
	}
	
	
}
