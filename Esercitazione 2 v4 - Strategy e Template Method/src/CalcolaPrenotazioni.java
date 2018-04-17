import java.util.ArrayList;

public class CalcolaPrenotazioni extends Calcoli {

	public CalcolaPrenotazioni(FiltroTemporale ft) {
		super(ft);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int eseguicalcoloeffettivo(ArrayList<OrdinazioneTavolo> filtrata) {
		return filtrata.size();
	}

}
