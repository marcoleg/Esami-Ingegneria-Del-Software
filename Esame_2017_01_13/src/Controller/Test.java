package Controller;

import java.util.Date;

import Model.Completo;
import Model.Consulente;
import Model.Dipendente;
import Model.Pasto;
import Model.Persona;
import Model.Primo;
import Model.Secondo;
import Model.TesseraMensa;

public class Test {

	public static void main(String[] args) {
		
		Mensa mensa = new Mensa();
		
		Persona persona1 = new Dipendente("Marco","Legittimo","email@gmail.com");
		Persona persona2 = new Consulente("Riccardo","Gabellini","email@oulook.it");
		
		TesseraMensa tessera1 = new TesseraMensa(0, persona1);
		TesseraMensa tessera2 = new TesseraMensa(1, persona2);
		
		long ora = new Date().getTime();
		long dieciGiorniFa =  10L * 24L * 60L * 60L * 1000L;
		long dueMesiFa = 60L * 24L * 60L * 60L * 1000L;
		
		Date dataPrimo = new Date(ora);
		Date dataSecondo = new Date(ora - dieciGiorniFa);
		Date dataCompleto = new Date(ora - dueMesiFa);
		
		Pasto primo = new Primo(dataPrimo);
		Pasto secondo = new Secondo(dataSecondo);
		Pasto completo = new Completo(dataCompleto);
		
		mensa.aggiungiTessera(tessera1);
		mensa.aggiungiTessera(tessera2);
		
		OperazioneSulContestoPasto operazioneDiMail = new NotificaViaEmail();
		OperazioneSulContestoPasto operazioneDiSceltaPersona = new NotificaTipoDiPersona();
		mensa.aggiungiOperazioneAllaListaDelleOperazioniDelContesto(operazioneDiMail);
		mensa.aggiungiOperazioneAllaListaDelleOperazioniDelContesto(operazioneDiSceltaPersona);
		
		mensa.aggiungiPasto(primo, persona2);
		mensa.aggiungiPasto(secondo, persona1);
		mensa.aggiungiPasto(completo, persona2);
		
		FiltroTemporale filtroMese = new FiltroMese();
		
		OperazioneDiCalcoloSuiPasti calcoloAcqua = new CalcolaAcqua(filtroMese);
		int risultatoAcqua = mensa.esegui(calcoloAcqua);
		
		OperazioneDiCalcoloSuiPasti calcolaFrutta = new CalcolaFrutta(filtroMese);
		int risultatoFrutta = mensa.esegui(calcolaFrutta);
		
		OperazioneDiCalcoloSuiPasti calcolaSecondi = new CalcolaSecondi(filtroMese);
		int risultatoSecondi = mensa.esegui(calcolaSecondi);
		
		System.out.println("Nell'ultimo mese sono state vendute " + risultatoAcqua + " bottiglie d'acqua.");
		System.out.println("Nell'ultimo mese sono state vendute " + risultatoFrutta + " porzioni di frutta.");
		System.out.println("Nell'ultimo mese sono state vendute " + risultatoSecondi + " porzioni di secondo.");
		
		
	}

}
