
public class Operazione1SuLiberaTavolo implements OperazioneSuLiberaTavolo {

	@Override
	public void liberaTavolo(Tavolo tavolo) {
		// TODO Auto-generated method stub
		System.out.println("eseguo l'operazione 1 sul tavolo numero "+tavolo.getTavolo()+" di "+tavolo.getPosti()+" posti.");
	}

}
