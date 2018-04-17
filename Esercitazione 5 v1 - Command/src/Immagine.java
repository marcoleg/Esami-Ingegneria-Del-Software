import java.util.ArrayList;

public class Immagine {
	
	private int righe;
	private int colonne;
	private int [][] immagine;
	
	public Immagine(int righe, int colonne){
		this.immagine = new int[righe][colonne];
	}
	
	public int getNumeroRighe(){
		return this.righe;
	}
	
	public int getNumeroColonne(){
		return this.colonne;
	}
	
	public int [][] getMatrix(){
		return this.immagine;
	}
}
