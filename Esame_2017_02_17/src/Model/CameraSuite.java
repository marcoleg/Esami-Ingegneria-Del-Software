package Model;

import Controller.OperazioneSuCamera;

public class CameraSuite extends Camera {

	private int costo;
	
	public CameraSuite(int numeroCamera, int numeroPiano, int numeroLetti) {
		super(numeroCamera, numeroPiano, numeroLetti);
		this.costo = 2;
	}

	public int getCosto() {
		return costo;
	}

	@Override
	public void visit(OperazioneSuCamera operazione) {
		operazione.eseguiSu(this);
	}
	

}
