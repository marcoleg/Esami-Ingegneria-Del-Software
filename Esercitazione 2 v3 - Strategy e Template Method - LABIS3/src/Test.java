//									DESCRIZIONE
/* L'idea è basata sul fatto che nella versione 1 (v1) vi erano due metodi nella classe Ristorante
calcolaOrdinazioneUltimaSettimana() e calcolaPersoneUltimaSettimana() che eseguivano sostanzialmente
un filtraggio settimanale della lista allo stesso modo. siccome è una ripetizione di codice è convenuto 
creare una classe astratta che eseguisse una volta per tutte tale filtraggio attraverso il metodo non astratto
calcola(ArrayList<OrdinazioneTavolo> al). Quest'ultimo dopo aver eseguito il filtraggio per settimana
richiama il metodo astratto eseguicalcoloeffettivo(ArrayList<OrdinazioneTavolo> filtrata) che,
essendo astratto, ciascuna classe (OperazioneRistorante e OrdinazioneTavolo) ha implementato a modo suo

RUOLI:

INTERFACCIA: usata per generalizzare bene il concetto di calcolo: in questo modo chi userà questo
codice sa che sottostante all'interfaccia vi sono tutti i metodi e le classi relativi al calcolo delle
prenotazioni

CLASSE ASTRATTA: indispensabile per definire il comportamento comune di tutte le classi che 
la estendono (filtraggio per settimana) e per definire il metodo astratto che ciascuna classe implementerà*/

public class Test {

	public static void main(String[] args) {
		
		Ristorante rist=new Ristorante();
		rist.addOrdinazione(10);
		rist.addOrdinazione(20); 
		rist.addOrdinazione(20); 
		
		OperazioneRistorante ops1 = new CalcolaPersone();
		OperazioneRistorante ops2 = new CalcolaPrenotazioni();
		
		int numpersone = rist.calcola(ops1);
		int numprenotazioni = rist.calcola(ops2);
		
		System.out.println("il numero di ord. dell ultima sett è di "+numprenotazioni);
		System.out.println("il numero di persone dell ultima sett è di "+numpersone);

	}

}
