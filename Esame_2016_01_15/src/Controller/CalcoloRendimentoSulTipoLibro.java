package Controller;

import java.util.ArrayList;

import Model.Libro;
import Model.LibroAPagamento;
import Model.LibroNonAPagamento;
import Model.Prenotazione;

public class CalcoloRendimentoSulTipoLibro extends FiltraggioLibri implements VisitorLibro {

	private int countApagamento;
	private int countNonAPagamento;
	private int interoDiRiferimento;
	
	public CalcoloRendimentoSulTipoLibro(FiltroTemporale filtroTemporale, int interoDiRiferimento) {
		super(filtroTemporale);
		this.countApagamento = 0;
		this.countNonAPagamento = 0;
		this.interoDiRiferimento = interoDiRiferimento;
	}

	@Override
	public void eseguiSu(LibroAPagamento libroAPagamento) {
		this.countApagamento += 1;
	}

	@Override
	public void eseguiSu(LibroNonAPagamento libroNonAPagamento) {
		this.countNonAPagamento += 1;
	}

	@Override
	public int calcoloEffettivo(ArrayList<Libro> listaFiltrata) {
		CalcoloRendimentoSulTipoLibro calcolo = new CalcoloRendimentoSulTipoLibro(filtroTemporale, interoDiRiferimento);
		for(Libro libro : listaFiltrata)
			for(Prenotazione prenotazione : libro.getListaPrenotazioni())
				libro.visit(calcolo);
		if(this.interoDiRiferimento == 2)
			return calcolo.getcountAPagamento();
		else
			return calcolo.getCountNonAPagamento();
	}
	
	private int getcountAPagamento() {
		return countApagamento;
	}
	
	private int getCountNonAPagamento() {
		return countNonAPagamento;
	}

}
