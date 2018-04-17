import java.util.ArrayList;
import java.util.Date;

public class Ristorante {
	
	private ArrayList<OrdinazioneTavolo> al=new ArrayList<OrdinazioneTavolo>();
	//private int aWeek=24*60*60*1000*7; // E' una settimana
	//private long now = new Date().getTime();

	
	public void addOrdinazione(int numP) {
		OrdinazioneTavolo ot= new OrdinazioneTavolo(new Date(),numP);
		al.add(ot);
	}
	
	/* IMPORTANTE: questo metodo serve per far sì che nel main venga dichiarata una variabile del tipo <interfaccia> ovvero
	di tipo OperazioneRistorante: si fa questo perchè occorre lavorare al livello più alto e quindi al più generale possibile.
	In programmatore saprà quindi che si tratterà di una operazione su un ristorante.
	In questo modo opr.calcola(<lista>) richiama il metodo "calcola" dell'interfaccia. Essendo l'interfaccia implementata dalla classe astratta,
	quest'ultima esegue il	proprio metodo calcola(<lista>) filtrando la lista per settimana ed infine richiamando il metodo astratto 
	che sarà poi definito per bene nelle classi concrete. in questo modo a seconda di come è stato istanziato l'oggetto opr 
	(ossia di tipo CalcolaPersone oppure	di tipo CalcolaPrenotazioni) verrà eseguito il relativo metodo della classe concreta che gli
	corrisponde ritornando l'intero calcolato.
	Nel main sarà semplicemente necessario fare due dichiarazioni di tipo OperazioneRistorante e inizializzarle una volta come tipo 
	CalcolaPerone e l'altra CalcolaPrenotazioni e passarle come parametro a questo metodo. ricorda che questo metodo va richiamato
	su un oggetto di tipo Ristorante!! */
	public int calcola(OperazioneRistorante opr) {
		return opr.calcola(this.al);
	}

/*			CODICE VERSIONE 1 --> rimosso poichè il filtraggio per settimana e il relativo comportamento 
			è stato definito nella classe astratta e nelle classi che la estendono
			
	public int calcolaOrdinazioneUltimaSettimana(){
		int count=0;
		int i=0;
		while(i!=al.size()) {
			if(al.get(i).getDate().getTime()>=(now - aWeek))
				count++;
			i++;
		}
		return count;
	}
	
	public int calcolaPersoneUltimaSettimana() {
		int count=0;
		int i=0;
		while(i!=al.size()) {
			if(al.get(i).getDate().getTime()>=(now - aWeek))
				count+=al.get(i).getNumP();
			i++;
		}
		return count;
	}*/
}
