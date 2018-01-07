package Model;

public class Biglietto {

	private Cliente cliente;
	private Tratta tratta;
	private int costoBiglietto;
	private PostoSedile posto;
	
	public Biglietto(Cliente cliente, Tratta tratta, int costoBiglietto, int posto) {
		this.cliente = cliente;
		this.tratta = tratta;
		this.costoBiglietto = costoBiglietto;
		this.posto = settaPosto(posto);
	}
	
	public PostoSedile settaPosto(int numeroPosto) {
		return new PostoSedile(numeroPosto);
	}
	
	public int getCostoBiglietto() {
		return this.costoBiglietto;
	}
}
