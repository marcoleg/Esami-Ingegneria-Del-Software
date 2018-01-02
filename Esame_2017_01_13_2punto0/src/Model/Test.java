package Model;

import java.util.ArrayList;
import java.util.Date;

import Controller.CalcolaAcqua;
import Controller.CalcolaSecondi;
import Controller.CalcoliSuPasto;
import Controller.FiltraggioPasti;
import Controller.FiltroMese;
import Controller.FiltroTemporale;
import Controller.Mensa;
import Controller.OperazioneSuPersona;
import Controller.VisitorPersona;

public class Test {
	
	public static void main(String[]args) {
		
		Mensa mensaCaritas = new Mensa("mensa caritas");
		
		Persona persona1 = new Dipendente("marco", "legittimo", "email1@email.it");
		Persona persona2 = new ConsulenteEsterno("mario", "rossi", "email2@email.it");
		
		Team team1 = new Team();
		team1.aggiungiPersonaNelTeam(persona1);
		team1.aggiungiPersonaNelTeam(persona2);
		
		TesseraMensa tessera1 = new TesseraMensa(0, persona1);
		TesseraMensa tessera2 = new TesseraMensa(1, persona2);
		
		mensaCaritas.aggiungiPersona(persona1);
		mensaCaritas.aggiungiPersona(persona2);
		
		mensaCaritas.aggiungiTessera(tessera1);
		mensaCaritas.aggiungiTessera(tessera2);
		
		long ora = new Date().getTime();
		long dieciGiorniFa =  10L * 24L * 60L * 60L * 1000L;
		long dueMesiFa = 60L * 24L * 60L * 60L * 1000L;
		
		Date dataPasto1 = new Date(ora);
		Pasto pasto1 = new Primo(dataPasto1);
		
		Date dataPasto2 = new Date(ora - dieciGiorniFa);
		Pasto pasto2 = new Secondo(dataPasto2);
		
		Date dataPasto3 = new Date(ora - dueMesiFa);
		Pasto pasto3 = new Completo(dataPasto3);
		
		Date dataPasto4 = new Date(ora - dueMesiFa);
		Pasto pasto4 = new Secondo(dataPasto4);
		
		ArrayList<Pasto> listaPastiPersona1 = new ArrayList<>();
		listaPastiPersona1.add(pasto1);
		listaPastiPersona1.add(pasto2);
		
		ArrayList<Pasto> listaPastiPersona2 = new ArrayList<>();
		listaPastiPersona2.add(pasto3);
		listaPastiPersona2.add(pasto4);
		
		mensaCaritas.aggiungiPastiATessera(tessera1, listaPastiPersona1);
		mensaCaritas.aggiungiPastiATessera(tessera2, listaPastiPersona2);
		
		mensaCaritas.eseguiOperazioniSuQuantoSpendonoLePersone();
		////////////////// SISTEMARE LE ISTRUZIONI DI STAMPA PER I VISITOR SULLE PERSONE
		mensaCaritas.eseguiOperazioneDiCalcoloDiAcquaFruttaSecondoPerOgniPasto();
		
		System.out.println("fine.");
		
	}

}
