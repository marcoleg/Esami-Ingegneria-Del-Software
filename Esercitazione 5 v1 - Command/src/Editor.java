import java.util.ArrayList;
import java.util.Stack;

public class Editor {
	
	private Immagine immagine;
	private Stack<Immagine> storico;
	
	public Editor(){
		this.immagine = new Immagine(0, 0);
		this.storico = new Stack<Immagine>();
	}
	
	public void esegui(OperazioneSuSelezione opi){
		this.storico.push(immagine);
		this.immagine = opi.eseguioperazione(immagine);
	}
	
	public void aggiungiAlloStorico(Immagine immagine){
	}
}
