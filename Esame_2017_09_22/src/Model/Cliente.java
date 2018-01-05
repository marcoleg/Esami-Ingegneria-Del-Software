package Model;

import Controller.VisitorCliente;

public interface Cliente {

	public String getNome();
	public String getCognome();
	public String getDataNascita();
	public void visitCliente(VisitorCliente visitorPersona);
	
}
