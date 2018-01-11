package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.Libro;
import Model.LibroAPagamento;
import Model.LibroNonAPagamento;
import Model.Prenotazione;
import Model.Sezione;
import Model.SezioneFoglia;
import Model.SezioneInterna;
import Model.SezioneRadice;
import Model.Tessera;
import Model.Utente;
import View.Stampa;

public class Biblioteca {

	private String nomeBiblio;
	private String indirizzoBiblio;
	private String telefonoBiblio;
	private String emailBiblio;
	private String direttoreBiblio;
	private ArrayList<Sezione> listaSezioni;
	private ArrayList<Tessera> listaTessera;
	private ArrayList<OperazioneSulContestoPrenotazione> listaOperazioniSulContestoPrenotazione;
	
	public Biblioteca(String nomeBiblio, String indirizzoBiblio, String telefonoBiblio, String emailBiblio, String direttoreBiblio) {
		this.nomeBiblio = nomeBiblio;
		this.indirizzoBiblio = indirizzoBiblio;
		this.telefonoBiblio = telefonoBiblio;
		this.emailBiblio = emailBiblio;
		this.direttoreBiblio = direttoreBiblio;
		this.listaSezioni = new ArrayList<>();
		this.listaTessera = new ArrayList<>();
		this.listaOperazioniSulContestoPrenotazione = new ArrayList<>();
	}
	
	public void aggiungiOperazioneSulContestoPrenotazione(OperazioneSulContestoPrenotazione operazione) {
		this.listaOperazioniSulContestoPrenotazione.add(operazione);
	}
	
	public LibroAPagamento creaLibroAPagamento(String nomeLibro) {
		return new LibroAPagamento(nomeLibro);
	}
	
	public LibroNonAPagamento creaLibroNonAPagamento(String nomeLibro) {
		return new LibroNonAPagamento(nomeLibro);
	}
	
	public Tessera creaTesseraUtente(int id, String nomeEcognomeUtente) {
		Tessera tessera = new Tessera(new Utente(id, nomeEcognomeUtente));
		this.listaTessera.add(tessera);
		return tessera;
	}
	
	public SezioneRadice creaSezioneRadice(String nome) {
		SezioneRadice sezioneRadice = new SezioneRadice(nome);
		this.listaSezioni.add(sezioneRadice);
		return sezioneRadice;
	}
	
	public SezioneInterna creaSezioneInterna(String nome, Sezione padre) {
		SezioneInterna sezioneInterna = new SezioneInterna(nome, padre);
		this.listaSezioni.add(sezioneInterna);
		return sezioneInterna;
	}
	
	public SezioneFoglia creaSezioneFoglia(String nome, Sezione padre) {
		SezioneFoglia sezioneFoglia = new SezioneFoglia(nome, padre);
		this.listaSezioni.add(sezioneFoglia);
		return sezioneFoglia;
	}
	
	public Prenotazione creaPrenotazione(Date dataInizio, Date dataFine, Tessera tesseraUtente, Libro libro) {
		Prenotazione prenotazione = new Prenotazione(dataInizio, dataFine, tesseraUtente);
		libro.aggiungiPrenotazione(prenotazione);
		for(OperazioneSulContestoPrenotazione operazione : this.listaOperazioniSulContestoPrenotazione)
			operazione.esegui(prenotazione);
		return prenotazione;
	}
	
	public void aggiungiLibroASezioneFoglia(Libro libro, Sezione sezioneFoglia) {
		sezioneFoglia.aggiungiLibroAFoglia(libro);
		Stampa.stampa("<< " + libro.getNomeLibro() + " >> è stato aggiunto alla sezione " + sezioneFoglia.getNome());
	}
	
	public Sezione getSezioneRadice() {
		for(Sezione sezione : this.listaSezioni)
			if(sezione.isRadice())
				return sezione;
		throw new IllegalStateException("Non è presente la sezione radice, si prega di aggiungerla!");
	}
	
	public void stampaLibriDisponibiliRispettoAiTotali() {
		Stampa.stampa("\nI libri disponibili rispetto a quelli totali sono: " + this.getSezioneRadice().calcola(new CalcolaLibriDisponibili()) + "/" 
											+ this.getSezioneRadice().calcola(new CalcoloLibriTotali()));
	}
	
	public void stampaLibriDisponibiliRispettoAiTotaliDataUnaSezione(Sezione sezione) {
		Stampa.stampa("\nI libri disponibili rispetto a quelli totali sono: " + sezione.calcola(new CalcolaLibriDisponibili()) + "/" 
				+ sezione.calcola(new CalcoloLibriTotali()) + " nella sezione " + sezione.getNome());
	}
	
	public void stampaLibriPreferitiDaiTesserati(FiltroTemporale filtro) {
		Calcolo calcolo = new CalcoloRendimentoSulTipoLibro(filtro, 2);
		int ammontareAPagamento = this.getSezioneRadice().calcola(calcolo);
		
		Calcolo calcolo1 = new CalcoloRendimentoSulTipoLibro(filtro, 1);
		int ammontareANonAPagamento = this.getSezioneRadice().calcola(calcolo1);
		
		Stampa.stampa("\nI libri preferiti in data " + filtro.getTempo() + " sono stati quelli a pagamento e sono stati: " + ammontareAPagamento);
		Stampa.stampa("\nI libri preferiti in data " + filtro.getTempo() + " sono stati quelli NON a pagamento e sono stati: " + ammontareANonAPagamento);
	}
}
