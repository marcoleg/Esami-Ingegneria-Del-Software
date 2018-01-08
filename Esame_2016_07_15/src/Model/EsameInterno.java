package Model;

import java.util.ArrayList;

public class EsameInterno extends Esame {
	
	private ArrayList<Esame> listaEsamiFigli;
	private Esame padre;

	public EsameInterno(Esame padre, String nomeCorso, String cognomeProfessore, String emailProfessore, AppelloDesame appelloDesame) {
		super(nomeCorso, cognomeProfessore, emailProfessore, appelloDesame);
		this.listaEsamiFigli = new ArrayList<>();
		this.padre = padre;
		this.padre.aggiungiFiglio(this);
	}

	@Override
	public Esame getPadre() {
		return this.padre;
	}

	@Override
	public ArrayList<Esame> getFigli() {
		return this.listaEsamiFigli;
	}

	@Override
	public void aggiungiFiglio(Esame figlio) {
		this.listaEsamiFigli.add(figlio);
	}

	@Override
	public boolean isRadice() {
		return false;
	}

}
