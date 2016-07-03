package ar.edu.unlam.basica2.tp5;

import java.util.TreeSet;

public class BarHomero {
	
	private TreeSet<Cliente> clientes;
	private Boolean open;
	
	public BarHomero(){
		this.clientes=new TreeSet<Cliente>();
		this.open=false;
	}
	
	public BarHomero(CompararPorEdad comparator){
		this.clientes=new TreeSet<Cliente>();
		this.open=false;
	}
	
	public void entraCliente(Cliente cliente){
		this.clientes.add(cliente);
	}
	
	public TreeSet<Cliente> getClientes(){
		return clientes;
	}

	public void abierto(){
		this.open=true;
	}
	public Boolean elBarSeEncuentra(){
		return open;
	}

}
