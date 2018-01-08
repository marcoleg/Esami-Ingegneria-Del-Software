package Controller;

import java.util.Date;

import Model.AppelloDesame;
import Model.Esame;
import Model.EsameInterno;
import Model.Esame;
import Model.EsameRadice;
import Model.Studente;
import Model.StudenteVecchioOrdinamento;

public class Test {

	public static void main(String[] args) {
		
		Universita universitaDegliStudiDiPerugia = new Universita();
				
		Studente marcoLegittimo = new StudenteVecchioOrdinamento(306021, "Marco", "Legittimo");
		
		universitaDegliStudiDiPerugia.aggiungiOperazioniAllaListaOperazioniSulContestoEsame(new EmettiUnSuonoQuandoVieneRegistratoUnEsame());
		
		Date ora = new Date();
		long unaSettimana = 7L * 24L * 60L * 60L * 1000L;
		
		AppelloDesame appelloDesameFittizio = new AppelloDesame(unaSettimana);
		Esame esameFittizio = new EsameRadice("fittizio", "fittizio", "fittizio@fittizio", appelloDesameFittizio);
		
		AppelloDesame appello1IngDelSoftware = new AppelloDesame(ora.getTime() - unaSettimana);	
		Esame esameIngegneriaDelSoftware = new EsameInterno(esameFittizio, "Ingegneria Del SW","Romeo","romeo@romeo.it", appello1IngDelSoftware);
		
		//Esame gruppo1 = new EsameRadice();
		// PROBLEMA: se aggiungo un esame senza esito (cioè prevedo l'esistenza di esami in generale senza che nessuno li abbia fatti), 
		// nel libretto come faccio a metterli cambiandogli l'esito??
		// devo tenere per forza una copia dell'esame in memoria per fare un check sul fatto se posso far iscrivere lo studente o meno
		
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(esameFittizio);
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameFittizio);
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, esameFittizio, 1000);
		
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(esameIngegneriaDelSoftware);
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameIngegneriaDelSoftware);	
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, esameIngegneriaDelSoftware, 18);
		
		AppelloDesame appello1Analisi1 = new AppelloDesame(unaSettimana);
		Esame esameAnalisi1 = new EsameInterno(esameFittizio, "Analisi 1", "Vinti","vinti@unipg.it", appello1Analisi1);
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(esameAnalisi1);
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameAnalisi1);
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, esameAnalisi1, 24);
		
		AppelloDesame appelloAnalisi2 = new AppelloDesame(unaSettimana);
		Esame esameAnalisi2 = new EsameInterno(esameAnalisi1, "Analisi 2", "Rubbioni", "rub@unipg.it", appelloAnalisi2);
		universitaDegliStudiDiPerugia.aggiungiEsameAllaListaDegliEsami(esameAnalisi2);
		universitaDegliStudiDiPerugia.aggiungiEsameAcuiLoStudenteSiIscrive(marcoLegittimo, esameAnalisi2);		
		universitaDegliStudiDiPerugia.aggiungiEsameAlLibrettoDelloStudente(marcoLegittimo, esameAnalisi2, 24);
		
		// CONTROLLARE GLI ESAMI PADRE QUANDO LI AGGIUNGO AL LIBRETTO
		// PROBLEMA: SE AGGIUNGO LE OPERAZIONI E LE ESEGUO CON UN OBSERVER NORMALE NON VA BENE PERCHè MI STAMPA MILLE STRINGHE, MENTRE
		// SE LE ISTANZIO COL NEW... DOVREI AVER RISOLTO DENTRO IL METODO CHE REGISTRA UN ESAME NEL LIBRETTO
		
		System.out.println("\nfine!");
	}

}
