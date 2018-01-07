package Model;

import java.util.ArrayList;

import Controller.StrategiaCartaFedelta;

public class CartaFedelta {
	
	private ArrayList<Cliente> listaClienti;
	private StrategiaCartaFedelta strategia;
	
	public CartaFedelta(StrategiaCartaFedelta strategia) {
		this.listaClienti = new ArrayList<>();
		this.strategia = strategia;
	}
	
	public void aggiornaUsufruentiCarta(Cliente cliente) {
		this.strategia.controllaSeAggiungerloAllaCartaFedelta(cliente, this.listaClienti);
	}
	
	public StrategiaCartaFedelta getStrategia() {
		return this.strategia;
	}
	
	public ArrayList<Cliente> getListaClienti(){
		return this.listaClienti;
	}

}
