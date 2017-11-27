package Model;

public class CameraSuite extends Camera {

	private int costo;
	
	public CameraSuite(int numeroCamera, int numeroPiano, int numeroLetti) {
		super(numeroCamera, numeroPiano, numeroLetti);
		this.costo = 2;
	}

}
