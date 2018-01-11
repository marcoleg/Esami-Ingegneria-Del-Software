package Controller;

import java.util.Date;

import Model.LibroAPagamento;
import Model.LibroNonAPagamento;
import Model.Prenotazione;
import Model.SezioneFoglia;
import Model.SezioneInterna;
import Model.SezioneRadice;
import Model.Tessera;

public class Test {

	public static void main(String[] args) {

		Biblioteca bibliotecaGabeELegio = new Biblioteca("Biblio Gabe&Legio", "Via del 18", "666", "biblio@biblio.it", "Leeegio");
		
		SezioneRadice sezioneRadice = bibliotecaGabeELegio.creaSezioneRadice("Sezione Radice");
		SezioneInterna sezioneInterna1 = bibliotecaGabeELegio.creaSezioneInterna("Sezione Interna 1", sezioneRadice);
		SezioneFoglia sezioneFoglia1 = bibliotecaGabeELegio.creaSezioneFoglia("Sezione Foglia 1 Interna 1", sezioneInterna1);
		SezioneInterna sezioneInterna2 = bibliotecaGabeELegio.creaSezioneInterna("Sezione Interna 2", sezioneRadice);
		SezioneFoglia sezioneFoglia2 = bibliotecaGabeELegio.creaSezioneFoglia("Sezione Foglia 2", sezioneInterna2);
		
		LibroAPagamento libroNarnia = bibliotecaGabeELegio.creaLibroAPagamento("Narnia");
		LibroNonAPagamento libroMatematica1 = bibliotecaGabeELegio.creaLibroNonAPagamento("Matematica 1");
		LibroNonAPagamento libroFisica1 = bibliotecaGabeELegio.creaLibroNonAPagamento("Fisica 1");
		
		bibliotecaGabeELegio.aggiungiLibroASezioneFoglia(libroNarnia, sezioneFoglia1);
		bibliotecaGabeELegio.aggiungiLibroASezioneFoglia(libroMatematica1, sezioneFoglia2);
		bibliotecaGabeELegio.aggiungiLibroASezioneFoglia(libroFisica1, sezioneFoglia2);
		
		Tessera tesseraMarcoLegittimo = bibliotecaGabeELegio.creaTesseraUtente(1, "Marco Legittimo");
		Tessera tesseraRiccardoGabellini = bibliotecaGabeELegio.creaTesseraUtente(2, "Riccardo Gabellini");
		
		Prenotazione prenotazione1 = bibliotecaGabeELegio.creaPrenotazione(new Date(118,0,4), new Date(118,0,8), tesseraMarcoLegittimo, libroNarnia);
		Prenotazione prenotazione4 = bibliotecaGabeELegio.creaPrenotazione(new Date(118,0,2), new Date(118,0,8), tesseraMarcoLegittimo, libroNarnia);
		Prenotazione prenotazione5 = bibliotecaGabeELegio.creaPrenotazione(new Date(118,0,2), new Date(118,0,8), tesseraMarcoLegittimo, libroNarnia);
		Prenotazione prenotazione2 = bibliotecaGabeELegio.creaPrenotazione(new Date(118,0,3), new Date(118,0,8), tesseraMarcoLegittimo, libroMatematica1);
		Prenotazione prenotazione3 = bibliotecaGabeELegio.creaPrenotazione(new Date(118,0,2), new Date(118,0,8), tesseraRiccardoGabellini, libroFisica1);
		
		bibliotecaGabeELegio.stampaLibriDisponibiliRispettoAiTotali();
		bibliotecaGabeELegio.stampaLibriDisponibiliRispettoAiTotaliDataUnaSezione(sezioneFoglia1);
		bibliotecaGabeELegio.stampaLibriPreferitiDaiTesserati(new FiltroSettimana());
	}

}
