
import java.util.Date;

public class OrdinazioneTavolo {
	
	private Date data;
	private int numP;
	
	
	public OrdinazioneTavolo(Date data,int numP) {
		this.data=data;
		this.numP=numP;
	}
	
	public Date getDate() {
		return this.data;
	}
	
	public int getNumP() {
		return this.numP;
	}
}
