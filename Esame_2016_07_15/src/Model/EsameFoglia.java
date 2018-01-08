package Model;

import java.util.ArrayList;

public class EsameFoglia extends Esame {

	private Esame padre;
	
	public EsameFoglia(Esame padre, String nomeCorso, String cognomeProfessore, String emailProfessore, AppelloDesame appelloDesame) {
		super(cognomeProfessore, cognomeProfessore, emailProfessore, appelloDesame);
		this.padre = padre;
		this.getPadre().aggiungiFiglio(this);
	}

	@Override
	public Esame getPadre() {
		return this.padre;
	}

	@Override
	public ArrayList<Esame> getFigli() {
		throw new IllegalStateException("Un esame foglia non può avere figli!");
	}

	@Override
	public void aggiungiFiglio(Esame figlio) {
		throw new IllegalStateException("Un esame foglia non può avere figli!");
	}

	@Override
	public boolean isRadice() {
		return false;
	}

}
