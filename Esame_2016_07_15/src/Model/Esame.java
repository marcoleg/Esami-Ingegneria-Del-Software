package Model;

import java.util.ArrayList;

public abstract class Esame {
	
	private AppelloDesame appelloDesame;
	private String nomeCorso;
	private String cognomeProfessore;
	
	public Esame(String nomeCorso, String cognomeProfessore, AppelloDesame appelloDesame) {
		this.appelloDesame = appelloDesame;
		this.nomeCorso = nomeCorso;
		this.cognomeProfessore = cognomeProfessore;
	}
	
	public AppelloDesame getAppello() {
		return this.appelloDesame;
	}
	
	public Esame getEsame(){
		return this;
	}
	
	public String getNome() {
		return this.nomeCorso;
	}
	
	public abstract Esame getPadre();
	public abstract ArrayList<Esame> getFigli();
	public abstract void aggiungiFiglio(Esame figlio);
	
}
