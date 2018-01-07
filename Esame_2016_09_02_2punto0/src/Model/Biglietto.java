package Model;

public class Biglietto {

	private Cliente cliente;
	private Tratta tratta;
	private PostoSedile posto;
	
	public Biglietto(Cliente cliente, Tratta tratta, int posto) {
		this.cliente = cliente;
		this.tratta = tratta;
		this.posto = settaPosto(posto);
	}
	
	public PostoSedile settaPosto(int numeroPosto) {
		return new PostoSedile(numeroPosto);
	}
}
