package Controller;

import java.util.Date;

import Model.AppelloDesame;
import Model.Esame;
import Model.EsameInterno;
import Model.Esame;
import Model.EsameRadice;
import Model.Studente;

public class Test {

	public static void main(String[] args) {
		
		Universita universitaDegliStudiDiPerugia = new Universita();
		
		Studente marcoLegittimo = new Studente(306021, "Marco", "Legittimo");
		
		Date ora = new Date();
		long unaSettimana = 7L * 24L * 60L * 60L * 1000L;
		
		AppelloDesame appelloDesameFittizio = new AppelloDesame(unaSettimana);
		Esame esameFittizio = new EsameRadice("fittizio", "fittizio", appelloDesameFittizio);
		
		AppelloDesame appello1IngDelSoftware = new AppelloDesame(ora.getTime() - unaSettimana);	
		Esame esameIngegneriaDelSoftware = new EsameInterno(esameFittizio, "Ingegneria Del SW","Romeo", appello1IngDelSoftware);
		
		//Esame gruppo1 = new EsameRadice();
		// PROBLEMA: se aggiungo un esame senza esito (cioè prevedo l'esistenza di esami in generale senza che nessuno li abbia fatti), 
		// nel libretto come faccio a metterli cambiandogli l'esito??
		// devo tenere per forza una copia dell'esame in memoria per fare un check sul fatto se posso far iscrivere lo studente o meno
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(esameIngegneriaDelSoftware);
		
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameIngegneriaDelSoftware);	
		
		AppelloDesame appello1Analisi1 = new AppelloDesame(unaSettimana);
		Esame esameAnalisi1 = new EsameInterno(esameFittizio, "Analisi 1", "Vinti", appello1Analisi1);
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(esameAnalisi1);
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameAnalisi1);
		
		AppelloDesame appelloAnalisi2 = new AppelloDesame(unaSettimana);
		Esame esameAnalisi2 = new EsameInterno(esameAnalisi1, "Analisi 2", "Rubbioni", appelloAnalisi2);
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(esameAnalisi2);
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameAnalisi2);
		
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, esameIngegneriaDelSoftware, 18);
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, esameAnalisi1, 24);
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, esameAnalisi2, 24);
		
		// CONTROLLARE GLI ESAMI PADRE QUANDO LI AGGIUNGO AL LIBRETTO
		
		System.out.println("fine!");
	}

}
