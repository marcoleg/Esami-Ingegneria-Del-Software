import java.util.ArrayList;
import java.util.Date;

public class Ristorante {
	
	private ArrayList<OrdinazioneTavolo> al=new ArrayList<OrdinazioneTavolo>();
	private int aWeek=24*60*60*1000*7; // E' una settimana
	private long now = new Date().getTime();

	
	public void addOrdinazione(int numP) {
		//quando creo un oggetto OrdinazioneTavolo gli passo il parametro new Date() perchè vuole la data di oggi
		OrdinazioneTavolo ot= new OrdinazioneTavolo(new Date(),numP);
		al.add(ot);
	}
	//le ArrayList partono da 1 a livello di indice
	
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
	}
}
