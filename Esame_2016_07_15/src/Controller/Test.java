package Controller;

import java.util.Date;

import Model.AppelloDesame;
import Model.Esame;
import Model.GruppoDiInsegnamento;
import Model.GruppoDiInsegnamentoRadice;
import Model.Studente;

public class Test {

	public static void main(String[] args) {
		
		Universita universitaDegliStudiDiPerugia = new Universita();
		
		Studente marcoLegittimo = new Studente(306021, "Marco", "Legittimo");
		
		Date ora = new Date();
		long unaSettimana = 7L * 24L * 60L * 60L * 1000L;
		
		AppelloDesame appello1IngDelSoftware = new AppelloDesame(ora.getTime() - unaSettimana);
		
		Esame esameIngegneriaDelSoftware = new Esame("Ingegneria Del SW","Romeo", appello1IngDelSoftware);
		
		GruppoDiInsegnamento gruppo1 = new GruppoDiInsegnamentoRadice();
		// PROBLEMA: se aggiungo un esame senza esito (cioè prevedo l'esistenza di esami in generale senza che nessuno li abbia fatti), 
		// nel libretto come faccio a metterli cambiandogli l'esito??
		// devo tenere per forza una copia dell'esame in memoria per fare un check sul fatto se posso far iscrivere lo studente o meno
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(gruppo1, esameIngegneriaDelSoftware);
		
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameIngegneriaDelSoftware);	
		
		AppelloDesame appello1Analisi1 = new AppelloDesame(unaSettimana);
		
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, gruppo1, esameIngegneriaDelSoftware, 18);
		
		
		
		System.out.println("fine!");
	}

}
