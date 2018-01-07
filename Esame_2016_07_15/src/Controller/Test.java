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
		
		marcoLegittimo.aggiungiAppelloAgliAppelliPartecipanti(appello1IngDelSoftware);
		
		Esame esameIngegneriaDelSoftware = new Esame("Ingegneria Del SW","Romeo", appello1IngDelSoftware);
		
		GruppoDiInsegnamento gruppo1 = new GruppoDiInsegnamentoRadice();
		gruppo1.aggiungiEsameAllaListaDegliEsamiDiQuestoGruppo(esameIngegneriaDelSoftware);
		
		marcoLegittimo.aggiungiEsameAlLibretto(gruppo1, esameIngegneriaDelSoftware);
	}

}
