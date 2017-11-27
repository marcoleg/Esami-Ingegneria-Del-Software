package Model;

import Controller.OperazioneSuCamera;

public class CameraNormale extends Camera {


	private int costo;
	
	public CameraNormale(int numeroCamera, int numeroPiano, int numeroLetti) {
		super(numeroCamera, numeroPiano, numeroLetti);
		this.costo = 1;
	}

	public int getCosto() {
		return costo;
	}
	
	@Override
	public void visit(OperazioneSuCamera operazione) {
		operazione.eseguiSu(this);
	}
	
}
