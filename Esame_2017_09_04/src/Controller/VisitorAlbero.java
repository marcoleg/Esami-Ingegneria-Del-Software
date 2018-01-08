package Controller;

import Model.AlberoAnziano;
import Model.AlberoGiovane;

public interface VisitorAlbero {

	public void eseguiSu(AlberoAnziano alberoAnziano);
	
	public void eseguiSu(AlberoGiovane alberoGiovane);
	
}
