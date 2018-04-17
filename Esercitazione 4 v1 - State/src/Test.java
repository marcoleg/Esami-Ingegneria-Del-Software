
public class Test {
/*  valutare se è il caso di usare uno state o meno (attenzione all'esame che non bisogna mettere per forza un design pattern
 *  In paint devo avere possibilita di aggiungere altri strumenti. */
	
	public static void main(String[] args) {
		
		StatoStrumento matita = new Matita();
		StatoStrumento pennello = new Pennello();
		Colore rosso = new Colore(2,1,3);
		Colore magenta = new Colore(5,7,2);
		
		Operazioni operazioneAtoB = new DaAaB();
		
		// Paint ha un costruttore Stato che gli passo e quindi inizialmente è matita
		Paint editor = new Paint(matita, rosso);
		
		//disegno
		editor.disegna(operazioneAtoB);
		
		//cambio stato
		//editor.setStato(pennello);
		editor.setColore(magenta);
		
		Operazioni operazioneBtoA = new DaBaA();
		
		editor.disegna(operazioneBtoA);
		
	}

}
