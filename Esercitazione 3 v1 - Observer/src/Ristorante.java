import java.util.ArrayList;
import java.util.Date;

public class Ristorante {
	
	private ArrayList<OrdinazioneTavolo> al=new ArrayList<OrdinazioneTavolo>();
	private ArrayList<OperazioneSuOrdinazione> opso = new ArrayList<OperazioneSuOrdinazione>();
	private ArrayList<OperazioneSuLiberaTavolo> listaOperazioniSuTavolo = new ArrayList<OperazioneSuLiberaTavolo>();
	
	public void aggiungiOperazioneSuOrdinazione(OperazioneSuOrdinazione opso){
		this.opso.add(opso);
	}
	
	public void aggiungiOperazioneSuTavolo(OperazioneSuLiberaTavolo operazione){
		this.listaOperazioniSuTavolo.add(operazione);
	}
	
	public void addOrdinazione(int numP) {
		OrdinazioneTavolo ot= new OrdinazioneTavolo(new Date(),numP);
		al.add(ot);
		// creo un for per notificare gli osservatori sul contesto UNA ORDINAZIONE
		// questo for vuole (TipoOggetto variabileDiTipoOggetto : OggettoDaScandire)
		
		for(OperazioneSuOrdinazione h : this.opso)
			h.esegui(ot);
		
	}
	
	public void liberaTavolo(Tavolo tavolo){
		for(OperazioneSuLiberaTavolo h : this.listaOperazioniSuTavolo)
			h.liberaTavolo(tavolo);
	}
	
	public int calcola(OperazioneRistorante opr) {
		return opr.calcola(this.al);
	}

}
