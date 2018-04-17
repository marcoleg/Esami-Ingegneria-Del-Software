
public class Taglia implements OperazioneSuSelezione {

	private Selezione selezione;
	private Editor editor;
	
	public Taglia(Selezione selezione, Editor editor){
		this.selezione=selezione;
		this.editor=editor;
	}
	
	@Override
	public Immagine eseguioperazione(Immagine immagine) {
		int [][] matrix1 = immagine.getMatrix();
		int [][] matrix2 = selezione.getMatrix();
		int righe=0;
		int colonne=0;
		for(int i = 0; i<immagine.getNumeroRighe();i++){
			for(int j = 0; j<immagine.getNumeroColonne();j++){
				if(i<=10 && j<=10){
					matrix1[i][j]=matrix2[i][j];
					righe = i;
					colonne = j;
				}
			}
		}
		Immagine immagineTagliata = new Immagine(righe,colonne);
		return immagineTagliata;
	}

}
