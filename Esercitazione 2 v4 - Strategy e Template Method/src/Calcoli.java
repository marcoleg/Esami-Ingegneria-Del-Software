import java.util.ArrayList;
import java.util.Date;

public abstract class Calcoli implements OperazioneRistorante {

	protected int aWeek=24*60*60*1000*7; // E' una settimana
	protected long now = new Date().getTime();
	protected FiltroTemporale ft;
	
	public Calcoli(FiltroTemporale ft){
		this.ft=ft;
	}
	
	protected abstract int eseguicalcoloeffettivo(ArrayList<OrdinazioneTavolo> filtrata);
	
	@Override
	public int calcola(ArrayList<OrdinazioneTavolo> al) { //Fa un filtraggio in base alla settimana

		ArrayList<OrdinazioneTavolo> filtrata=new ArrayList<OrdinazioneTavolo>();
		// mi ritorna nella lista filtrata l'operazione filtra dell'oggetto ft (che è diverso in base al filtroSett o filMese)
		filtrata = this.ft.filtra(al);
		
		// sulla lista filtrata gli faccio eseguire calcoloeffettivo che è quello delle classi concrete che implementano CalcolaPers o calOrd
		return this.eseguicalcoloeffettivo(filtrata);
	}
}
