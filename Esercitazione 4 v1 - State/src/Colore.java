
public class Colore {
	

	private int rosso;
	private int verde;
	private int blu;
	
	public Colore(int rosso, int verde, int blu){	
		this.rosso=rosso;
		this.verde=verde;
		this.blu=blu;
	}
	
	public String getIndici(){
		return "(R:"+ this.rosso+"; G:"+ this.verde+"; B:"+this.blu+")";
	}
	
	
}
