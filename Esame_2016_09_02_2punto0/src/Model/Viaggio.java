package Model;

import java.util.ArrayList;

public class Viaggio {

	private Tratta tratta;
	private ArrayList<PostoSedile> postiTotali;
	private ArrayList<PostoSedile> postiDisponibili;
	
	public Viaggio(Tratta tratta, int numeroTotaleDiPosti) {
		this.tratta = tratta;
		this.postiDisponibili = new ArrayList<>();
		this.postiTotali = settaNumeroTotaliDiPostiAutobus(numeroTotaleDiPosti);
	}
	
	public ArrayList<PostoSedile> settaNumeroTotaliDiPostiAutobus(int numeroTotaleDiPosti){
		this.postiTotali = new ArrayList<>();
		for(int i = 0; i < numeroTotaleDiPosti; i++) {
			PostoSedile temp = new PostoSedile(i+1);
			this.postiTotali.add(temp);
		}
		return this.postiTotali;
	}
	
	
}
