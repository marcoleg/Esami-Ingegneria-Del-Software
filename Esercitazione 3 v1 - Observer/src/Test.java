//nel main ci va il filtro temporale che si configura dinamicamente dal main

public class Test {

	public static void main(String[] args) {
		
		Ristorante rist=new Ristorante();
		OperazioneSuOrdinazione operazioneOrdinazione1 = new Operazione1Ordinazione();
		rist.aggiungiOperazioneSuOrdinazione(operazioneOrdinazione1);
		
		OperazioneSuLiberaTavolo operazioneLiberaTavolo = new Operazione1SuLiberaTavolo();
		Tavolo tavolo = new Tavolo (10,5);
		operazioneLiberaTavolo.liberaTavolo(tavolo);
		
		rist.addOrdinazione(10);
		rist.addOrdinazione(20); 
		rist.addOrdinazione(20); 
		
		FiltroTemporale mese = new FiltraOrdinazioniPerMese();
		FiltroTemporale settimana = new FiltraOrdinazioniPerSettimana();
		
		OperazioneRistorante ops1 = new CalcolaPersone(mese);
		OperazioneRistorante ops2 = new CalcolaPrenotazioni(mese);
		OperazioneRistorante ops3 = new CalcolaPersone(settimana);
		OperazioneRistorante ops4 = new CalcolaPrenotazioni(settimana);
		
		int numpersonemese = rist.calcola(ops1);
		int numprenotazionimese = rist.calcola(ops2);
		int numpersonesettimana = rist.calcola(ops3);
		int numprenotazionisettimana = rist.calcola(ops4);
		
		System.out.println("il numero di ord. dell ultima settimana è di "+numprenotazionisettimana);
		System.out.println("il numero di persone dell ultima settimana è di "+numpersonesettimana);
		System.out.println("il numero di ord. dell ultimo mese è di "+numprenotazionimese);
		System.out.println("il numero di persone dell ultimo mese è di "+numpersonemese);
	}

}
