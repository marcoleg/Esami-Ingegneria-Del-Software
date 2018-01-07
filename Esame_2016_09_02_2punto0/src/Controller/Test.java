package Controller;

import java.util.Date;

import Model.CartaFedelta;
import Model.Citta;
import Model.Cliente;
import Model.Tratta;
import Model.Viaggio;

public class Test {
	
	public static void main(String[]args) {
		
		ScontoDelDieciPerCentoAchiFaPiuDiUnViaggio sconto10 = new ScontoDelDieciPerCentoAchiFaPiuDiUnViaggio();
		CartaFedelta cartaFedelta1 = new CartaFedelta(sconto10);
		
		CompagniaAutobus compagnia = new CompagniaAutobus(cartaFedelta1);
		
		Citta perugia = new Citta();
		Citta lecce = new Citta();
		
		Date ora = new Date();
		long unOra = 60L * 60L * 1000L;
		
		Tratta tratta1 = compagnia.aggiungiTratta(perugia, lecce, ora.getTime() + 3 * unOra, ora.getTime() + 9 * unOra);
		Tratta tratta2= compagnia.aggiungiTratta(perugia, lecce, ora.getTime() + 3 * unOra, ora.getTime() + 9 * unOra);
		
		Cliente cliente1 = compagnia.aggiungiCliente(1, "Marco", "Legittimo");
		Cliente cliente2 = compagnia.aggiungiCliente(2, "Riccardo", "Gabellini");
		Cliente cliente3 = compagnia.aggiungiCliente(1, "Mirco", "Legittimo");
		Cliente cliente4 = compagnia.aggiungiCliente(2, "Richard", "Gabellini");
		Cliente cliente5 = compagnia.aggiungiCliente(1, "Merco", "Legittimo");
		Cliente cliente6 = compagnia.aggiungiCliente(2, "Riccarda", "Gabellini");
		Cliente cliente7 = compagnia.aggiungiCliente(1, "Marchino", "Legittimo");
		Cliente cliente8 = compagnia.aggiungiCliente(2, "Riccardino", "Gabellini");
		Cliente cliente9 = compagnia.aggiungiCliente(1, "Marcuccio", "Legittimo");
		Cliente cliente10 = compagnia.aggiungiCliente(2, "Riccarduccio", "Gabellini");
		Cliente cliente11 = compagnia.aggiungiCliente(2, "Richardo", "Gabellini");
		Cliente cliente12 = compagnia.aggiungiCliente(2, "Ricco", "Gabellini");
		
		Viaggio viaggio1 = compagnia.aggiungiViaggio(tratta1, 12, 100);
		Viaggio viaggio2 = compagnia.aggiungiViaggio(tratta2, 5, 10);
		
		StatisticaGuadagni statisticaGuadagnoTotale = new CalcolaGuadagnoComplessivo();
		
		compagnia.aggiungiStatisticaSuiGuadagni(statisticaGuadagnoTotale);
		
		CalcoloSuPosti algoritmoDiCalcoloInBaseAlleUltimeDieciPersone = new CalcolaCostoBigliettoInBaseAgliUltimiDieciPosti(viaggio1);
		viaggio1.setAlgoritmoDiCalcoloBiglietto(algoritmoDiCalcoloInBaseAlleUltimeDieciPersone);
		
		// QUI CI POTREBBE ESSERE UN NULL POINTER
		CalcoloSuPosti algoritmoDiCalcoloInBaseAlleUltimeDieciPersone2 = new CalcolaCostoBigliettoInBaseAgliUltimiDieciPosti(viaggio2);
		viaggio2.setAlgoritmoDiCalcoloBiglietto(algoritmoDiCalcoloInBaseAlleUltimeDieciPersone2);
		
		compagnia.aggiungiBiglietto(viaggio1, cliente1, tratta1, 1);
		compagnia.aggiungiBiglietto(viaggio1, cliente2, tratta1, 2);
		compagnia.aggiungiBiglietto(viaggio1, cliente3, tratta1, 3);
		compagnia.aggiungiBiglietto(viaggio1, cliente4, tratta1, 4);
		compagnia.aggiungiBiglietto(viaggio1, cliente5, tratta1, 5);
		compagnia.aggiungiBiglietto(viaggio1, cliente6, tratta1, 6);
		compagnia.aggiungiBiglietto(viaggio1, cliente7, tratta1, 7);
		compagnia.aggiungiBiglietto(viaggio1, cliente8, tratta1, 8);
		compagnia.aggiungiBiglietto(viaggio1, cliente9, tratta1, 9);
		compagnia.aggiungiBiglietto(viaggio1, cliente10, tratta1, 10);
		compagnia.aggiungiBiglietto(viaggio1, cliente11, tratta1, 11);
		compagnia.aggiungiBiglietto(viaggio1, cliente12, tratta1, 12);
		
		compagnia.aggiungiBiglietto(viaggio2, cliente1, tratta2, 1);
		compagnia.aggiungiBiglietto(viaggio2, cliente2, tratta2, 2);
		
		System.out.println("fine");
		
	}

}
