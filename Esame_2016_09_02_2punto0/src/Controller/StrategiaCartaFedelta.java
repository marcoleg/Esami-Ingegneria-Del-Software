package Controller;

import java.util.ArrayList;

import Model.Cliente;

public interface StrategiaCartaFedelta {

	public int calcolaSconto(Cliente cliente, ArrayList<Cliente> listaClientiUsufutori, int prezzoPieno);
	
	public void controllaSeAggiungerloAllaCartaFedelta(Cliente cliente, ArrayList<Cliente> listaClienti);
	
}
