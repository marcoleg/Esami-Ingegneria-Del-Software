import java.util.ArrayList;
import java.util.Date;

public abstract class CalcoliPerSettimana implements OperazioneRistorante {

	protected int aWeek=24*60*60*1000*7; // E' una settimana
	protected long now = new Date().getTime();
	
	protected abstract int eseguicalcoloeffettivo(ArrayList<OrdinazioneTavolo> filtrata);
	
	@Override
	public int calcola(ArrayList<OrdinazioneTavolo> al) { //Fa un filtraggio in base alla settimana

		ArrayList<OrdinazioneTavolo> filtrata=new ArrayList<OrdinazioneTavolo>();
		int i=0;
		while(i!=al.size()) {
			if(al.get(i).getDate().getTime()>=(now - aWeek))
				filtrata.add(al.get(i));
			i++;
		}	
	return this.eseguicalcoloeffettivo(filtrata);
	}
}
