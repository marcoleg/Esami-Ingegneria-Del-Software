import java.util.ArrayList;
import java.util.Date;

public class FiltraOrdinazioniPerMese implements FiltroTemporale {

	private long aMonth=24*60L*60*1000L*30L; // E' una mese
	private long now = new Date().getTime();
	
	@Override
	public ArrayList<OrdinazioneTavolo> filtra(ArrayList<OrdinazioneTavolo> al) {
	
		ArrayList<OrdinazioneTavolo> filtrata=new ArrayList<OrdinazioneTavolo>();
	
		int i=0;
		while(i!=al.size()) {
			if(al.get(i).getDate().getTime()>=(now - aMonth))
				filtrata.add(al.get(i));
			i++;
		}	
	return filtrata;
	}
	
}
