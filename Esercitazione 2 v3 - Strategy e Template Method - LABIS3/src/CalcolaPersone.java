import java.util.ArrayList;

public class CalcolaPersone extends CalcoliPerSettimana {

	@Override
	protected int eseguicalcoloeffettivo(ArrayList<OrdinazioneTavolo> filtrata) {
		int count=0;
		int i=0;
		while(i!=filtrata.size()) {
				count+=filtrata.get(i).getNumP();
			i++;
		}
		return count;
	}

}
