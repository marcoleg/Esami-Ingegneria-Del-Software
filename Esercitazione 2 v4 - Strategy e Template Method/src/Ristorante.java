import java.util.ArrayList;
import java.util.Date;

public class Ristorante {
	
	private ArrayList<OrdinazioneTavolo> al=new ArrayList<OrdinazioneTavolo>();
	
	public void addOrdinazione(int numP) {
		OrdinazioneTavolo ot= new OrdinazioneTavolo(new Date(),numP);
		al.add(ot);
	}
	
	public int calcola(OperazioneRistorante opr) {
		return opr.calcola(this.al);
	}

}
