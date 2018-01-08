package Controller;

import java.util.Date;

import Model.Albero;
import Model.Area;
import Model.RaccoltaAlbero;

public class Test {

	public static void main(String[] args) {

		AziendaAgricola aziendaGabeElegio = new AziendaAgricola("Azienda Gabellini&Legittimo SRL");
		
		aziendaGabeElegio.aggiungiOperazioniAlleOperazioniSulContestoRaccolta(new NotificaEmailPerOgniRaccolta("info@aziendaagricola.it"));
		
		Albero alberoAnziano1 = aziendaGabeElegio.creaAlberoAnziano("Pero", "Frutto", 10, 5);
		Albero alberoGiovane2 = aziendaGabeElegio.creaAlberoGiovane("Pesco", "Frutto", 1, 5);
		Albero alberoAnziano3 = aziendaGabeElegio.creaAlberoAnziano("Melo", "Frutto", 100, 1000);
		
		Area areaRadice = aziendaGabeElegio.creaAreaRadice("Area Radice");
		Area areaInterna1 = aziendaGabeElegio.creaAreaInterna("Area Interna 1", areaRadice);
		Area areaInterna2 = aziendaGabeElegio.creaAreaInterna("Area Interna 2", areaRadice);
		Area areaFoglia1 = aziendaGabeElegio.creaAreaFoglia("Area Foglia 1", areaInterna1);
		Area areaFoglia2 = aziendaGabeElegio.creaAreaFoglia("Area Foglia 2", areaInterna2);
		
		aziendaGabeElegio.aggiungiAlberoAdArea(areaFoglia1, alberoAnziano1);
		aziendaGabeElegio.aggiungiAlberoAdArea(areaFoglia2, alberoGiovane2);
		aziendaGabeElegio.aggiungiAlberoAdArea(areaFoglia1, alberoAnziano3);
		
		RaccoltaAlbero raccoltaAlbero1 = aziendaGabeElegio.creaRaccolta(alberoAnziano1, new Date(118,0,2), new Date(118,0,6), 100);
		RaccoltaAlbero raccoltaAlbero2 = aziendaGabeElegio.creaRaccolta(alberoGiovane2, new Date(118,0,2), new Date(118,0,6), 200);
		RaccoltaAlbero raccoltaAlbero3 = aziendaGabeElegio.creaRaccolta(alberoAnziano3, new Date(118,0,2), new Date(118,0,6), 300);
		
		aziendaGabeElegio.stampaClassificaAlberiMiglioriSuPeriodo(new FiltroMese());
		aziendaGabeElegio.stampaClassificaAlberiMiglioriSuPeriodoInBaseAlTipo(new FiltroMese());
		
		System.out.println("fine!");
	}
}
