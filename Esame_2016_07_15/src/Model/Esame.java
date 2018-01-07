package Model;

public class Esame {

	private AppelloDesame appelloDesame;
	private String nomeCorso;
	private String cognomeProfessore;
	
	public Esame(String nomeCorso, String cognomeProfessore, AppelloDesame appelloDesame) {
		this.appelloDesame = appelloDesame;
		this.nomeCorso = nomeCorso;
		this.cognomeProfessore = cognomeProfessore;
	}
	
}
