package Controller;

import java.util.ArrayList;

import Model.Cliente;

public class ScontoDelDieciPerCentoAchiFaPiuDiUnViaggio implements StrategiaCartaFedelta {

	@Override
	public int calcolaSconto(Cliente cliente, ArrayList<Cliente> listaClientiUsufurutori, int prezzoPieno) {
		if(listaClientiUsufurutori.size() == 0)
			return prezzoPieno;
		else{ 
			if(listaClientiUsufurutori.contains(cliente))
				return prezzoPieno - prezzoPieno / 10;
			else
				return prezzoPieno;
		}
	}

	@Override
	public void controllaSeAggiungerloAllaCartaFedelta(Cliente cliente, ArrayList<Cliente> listaClienti) {
		if(cliente.getNumeroViaggi() >= 1)
			listaClienti.add(cliente);
	}

}
