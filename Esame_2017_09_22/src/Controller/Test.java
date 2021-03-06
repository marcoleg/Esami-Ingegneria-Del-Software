package Controller;

import java.util.Date;

import Model.Adulto;
import Model.Bambino;
import Model.Citta;
import Model.Cliente;
import Model.PacchettoViaggio;
import Model.ViaggioVenduto;

public class Test {

	public static void main(String[] args) {

		Agenzia agenziaViaggiMarcoEluca =  new Agenzia();
		
		OperazioneSulContestoViaggio operazioneDiNotificaMail = new NotificaMailPerOgniViaggio();
		
		agenziaViaggiMarcoEluca.aggiungiOperazioneAllaListaDelleOperazioniSulContestoViaggio(operazioneDiNotificaMail);
		
		Cliente luca = new Bambino("luca", "consalvi", "05/01/1987");
		Cliente marco = new Adulto("marco", "legittimo", "18/05/1995");
		Cliente marco2 = new Adulto("marco", "legittimo", "18/05/1995");
		Cliente luca2 = new Bambino("luca", "consalvi", "05/01/1987");

		Citta ibiza = new Citta("Ibiza", "Spagna", "Europa");
		Citta cagliari = new Citta("Cagliari", "Italia", "Europa");
		
		PacchettoViaggio pacchetto1 = new PacchettoViaggio("Ibiza", "vacanza da urlo!", 100, 7, ibiza);
		PacchettoViaggio pacchetto2 = new PacchettoViaggio("Cagliari", "vacanza da urlo!", 100, 7, cagliari);
		
		Date ora = new Date();
		long unGiorno = 1L * 24L * 60L * 60L * 1000L;
		long unaSettimana = 7L * 24L * 60L * 60L * 1000L;
		long unMese = 30L * 24L * 60L * 60L * 1000L;
		
		ViaggioVenduto viaggioVenduto1 = new ViaggioVenduto(pacchetto1, ora.getTime() + unMese, ora.getTime() + unMese + unaSettimana);
		
		viaggioVenduto1.aggiungiCliente(luca);
		viaggioVenduto1.aggiungiCliente(marco);
		viaggioVenduto1.aggiungiCliente(luca2);
		viaggioVenduto1.aggiungiCliente(marco2);
		
		ViaggioVenduto viaggioVenduto2 = new ViaggioVenduto(pacchetto2, ora.getTime() + unMese, ora.getTime() + unMese + unaSettimana);
		
		viaggioVenduto2.aggiungiCliente(luca);
		viaggioVenduto2.aggiungiCliente(marco);
		viaggioVenduto2.aggiungiCliente(luca2);
		viaggioVenduto2.aggiungiCliente(marco2);
		
		agenziaViaggiMarcoEluca.aggiungiViaggio(viaggioVenduto1);
		agenziaViaggiMarcoEluca.aggiungiViaggio(viaggioVenduto2);
		
		agenziaViaggiMarcoEluca.stampaCostoTotaleInBaseAlNumeroDiPersone(new OperazioneDiCalcoloInBaseAlCliente(viaggioVenduto1.getPacchettoViaggio(), viaggioVenduto1.getListaClienti())
																			, viaggioVenduto1);
		
		System.out.println("fine!");
	}

}
