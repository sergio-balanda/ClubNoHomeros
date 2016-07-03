package ar.edu.unlam.basica2.tp5;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Cliente>{

	@Override
	public int compare(Cliente unCliente, Cliente otroCliente) {
		
		return unCliente.getEdad() - otroCliente.getEdad();
	}

}
