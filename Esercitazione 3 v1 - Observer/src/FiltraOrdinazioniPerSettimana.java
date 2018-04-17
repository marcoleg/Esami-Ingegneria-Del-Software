import java.util.ArrayList;
import java.util.Date;

public class FiltraOrdinazioniPerSettimana implements FiltroTemporale {

	private int aWeek=24*60*60*1000*7; // E' una settimana
	private long now = new Date().getTime();
	
	@Override
	public ArrayList<OrdinazioneTavolo> filtra(ArrayList<OrdinazioneTavolo> al) {
		
		ArrayList<OrdinazioneTavolo> filtrata=new ArrayList<OrdinazioneTavolo>();
		
		int i=0;
		while(i!=al.size()) {
			if(al.get(i).getDate().getTime()>=(now - aWeek))
				filtrata.add(al.get(i));
			i++;
		}	
	return filtrata;
	}

}
