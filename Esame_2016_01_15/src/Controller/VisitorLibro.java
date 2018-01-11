package Controller;

import Model.LibroAPagamento;
import Model.LibroNonAPagamento;

public interface VisitorLibro {

	public void eseguiSu(LibroAPagamento libroAPagamento);
	
	public void eseguiSu(LibroNonAPagamento libroNonAPagamento);
	
}
