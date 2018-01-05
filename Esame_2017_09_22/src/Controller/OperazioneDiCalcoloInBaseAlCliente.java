package Controller;

import java.util.ArrayList;

import Model.Adulto;
import Model.Bambino;
import Model.Cliente;
import Model.PacchettoViaggio;

public class OperazioneDiCalcoloInBaseAlCliente implements VisitorCliente, OperazioneDiCalcoloCostoSuViaggio{

	private PacchettoViaggio pacchettoViaggio;
	private ArrayList<Cliente> listaClientiViaggio;
	private int costo;
	
	public OperazioneDiCalcoloInBaseAlCliente(PacchettoViaggio pacchettoViaggio, ArrayList<Cliente> listaClientiViaggio) {
		this.pacchettoViaggio = pacchettoViaggio;
		this.listaClientiViaggio = listaClientiViaggio;
		this.costo = 0;
	}
	
	@Override
	public void eseguiSu(Adulto adulto) {
		this.costo += this.pacchettoViaggio.getCosto();
	}

	@Override
	public void eseguiSu(Bambino bambino) {
		this.costo += this.pacchettoViaggio.getCosto() / 2;
	}

	@Override
	public int calcolaCosto() {
		for(Cliente cliente : this.listaClientiViaggio)
			cliente.visitCliente(this);
		return this.costo;
	}

	
}
