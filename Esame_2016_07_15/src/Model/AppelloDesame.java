package Model;

public class AppelloDesame {

	private boolean iscrizione;
	private int esito;
	private long dataEsame;
	
	public AppelloDesame(long dataEsame) {
		this.iscrizione = false;
		this.esito = -1;
		this.dataEsame = dataEsame;
	}
	
	public void setIscrizione() {
		this.iscrizione = true;
	}
}
