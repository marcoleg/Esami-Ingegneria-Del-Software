package Model;

import Controller.VisitorAlbero;

public class AlberoGiovane extends Albero {

	public AlberoGiovane(String nome, String tipo, int eta, int metriQuadri) {
		super(nome, tipo, eta, metriQuadri);
	}

	@Override
	public void visit(VisitorAlbero visitorAlbero) {
		visitorAlbero.eseguiSu(this);
	}
}
