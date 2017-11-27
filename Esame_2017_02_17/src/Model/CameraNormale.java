package Model;

public class CameraNormale extends Camera {

	private int costo;
	
	public CameraNormale(int numeroCamera, int numeroPiano, int numeroLetti) {
		super(numeroCamera, numeroPiano, numeroLetti);
		this.costo = 1;
	}
	
}
