/* Esercitazione fatta "cosi come viene con java" --> i successivi livelli di raffinamento sono i package 2.1 -2.1 ecc*/
public class Test {

	public static void main(String[] args) {
		
		Ristorante rist=new Ristorante();
		rist.addOrdinazione(10);
		rist.addOrdinazione(20);
		
		Ristorante rist2=new Ristorante();
		rist2.addOrdinazione(2);
		
		int o1 = rist.calcolaOrdinazioneUltimaSettimana() + rist2.calcolaOrdinazioneUltimaSettimana();
		int p1 = rist.calcolaPersoneUltimaSettimana() + rist2.calcolaOrdinazioneUltimaSettimana();
		
		System.out.println("il numero di ord. dell ultima sett è di "+o1);
		System.out.println("il numero di persone dell ultima sett è di "+p1);
	}

}
