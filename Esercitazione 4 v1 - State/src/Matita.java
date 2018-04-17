
public class Matita implements StatoStrumento {

	@Override
	public void disegna(Colore colore, Operazioni operazione, StatoStrumento stato) {
		System.out.println("Sto disegnando con una matita di colore "+colore.getIndici());
		stato = operazione.cambiaStato();
	}

}
