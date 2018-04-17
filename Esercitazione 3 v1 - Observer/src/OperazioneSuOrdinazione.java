
public interface OperazioneSuOrdinazione {
	
	//un osservatore 99% delle volte è void
	public void esegui(OrdinazioneTavolo ot);
	
}
/* OBSERVER:
 Per prima cosa creo l'interfaccia in cui ci sara il metodo che dovranno fare gli observer.
 Vado nella classe Subject (che è quella dove c'è il contesto, nel nostro caso Ristorante) dove creo un metodo dove
 gli dico di aggiungere l'operazione (observer) alla lista. Scandisco la lista degli "oggetti di tipo interfaccia"
 (anche se le interfacce non si possono istanziare) e gli dico che ogni operazione deve eseguire il metodo che ho 
 dichiarato nell'interface passandogli come parametro il contesto.
 
 */