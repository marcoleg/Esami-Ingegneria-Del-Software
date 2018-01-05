package Controller;

import java.util.ArrayList;
import java.util.Date;

import Model.ViaggioVenduto;

public class FiltroMese implements FiltroTemporale {

	private Date ora;
	private long unGiorno = 1L * 24L * 60L * 60L * 1000L;
	private long unaSettimana = 7L * 24L * 60L * 60L * 1000L;
	private long unMese = 30L * 24L * 60L * 60L * 1000L;
	private ArrayList<ViaggioVenduto> listaViaggiFiltratiPerMese;
	
	public FiltroMese() {
		this.ora = new Date();
		this.listaViaggiFiltratiPerMese = new ArrayList<>();
	}
	
	@Override
	public ArrayList<ViaggioVenduto> filtra(ArrayList<ViaggioVenduto> listaViaggiDaFiltrare) {
		for(ViaggioVenduto viaggioVenduto : listaViaggiDaFiltrare) 
			if(viaggioVenduto.getDataInizio() + unMese > ora.getTime() && viaggioVenduto.getDataInizio() < ora.getTime())
				this.listaViaggiFiltratiPerMese.add(viaggioVenduto);
		return this.listaViaggiFiltratiPerMese;
	}

}
