
public class Pennello implements StatoStrumento {

	@Override
	public void disegna(Colore colore, Operazioni operazione, StatoStrumento stato) {
		System.out.println("Sto disegnando con un pennello di colore "+colore.getIndici());
		stato = operazione.cambiaStato();
		
	}

}
