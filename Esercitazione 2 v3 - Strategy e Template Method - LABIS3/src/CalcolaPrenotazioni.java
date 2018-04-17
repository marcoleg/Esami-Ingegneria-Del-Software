import java.util.ArrayList;

public class CalcolaPrenotazioni extends CalcoliPerSettimana {

	@Override
	protected int eseguicalcoloeffettivo(ArrayList<OrdinazioneTavolo> filtrata) {
		return filtrata.size();
	}

}
