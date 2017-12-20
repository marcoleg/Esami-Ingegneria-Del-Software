package Model;

public class Biglietto {

	private int numeroBiglietto;
	private Cliente cliente;
	private Tratta tratta;
	
	public Biglietto(int numeroBiglietto, Cliente cliente, Tratta tratta) {
		this.numeroBiglietto = numeroBiglietto;
		this.cliente = cliente;
		this.tratta = tratta;
	}
	
	
}
