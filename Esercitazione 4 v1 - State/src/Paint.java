// è la classe macchina a stati

public class Paint {
	
	private StatoStrumento strumento;
	private Colore colore;
	
	public Paint (StatoStrumento statoiniziale, Colore colore){
		this.strumento = statoiniziale;
		this.colore = colore;
	}
	
	public void setStato(StatoStrumento stato){
		this.strumento = stato;
	}
	
	public void setColore(Colore colore){
		this.colore = colore;
	}
	
	public void disegna(Operazioni operazione){
		// qui richiamo disegna su un oggetto interface che farà la sua funzione disegna
		this.strumento.disegna(this.colore, operazione, this.strumento);
	}
}
