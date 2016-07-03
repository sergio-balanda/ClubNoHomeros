package ar.edu.unlam.basica2.tp5;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

import ar.edu.unlam.basica2.tp5.BarHomero;
import ar.edu.unlam.basica2.tp5.Cliente;
import ar.edu.unlam.basica2.tp5.CompararPorEdad;
import junit.framework.Assert;

public class TestClubNoHomeros {

	@Test
	public void testAbrirElBAR() {
		BarHomero elBar = new BarHomero();
		elBar.abierto();
		assertTrue(elBar.elBarSeEncuentra() == true);
	}
	
	@Test
	public void testAgragarClientesYnoIguales(){
		BarHomero elBar = new BarHomero();
		Cliente clienteUno = new Cliente("Homero",21);
		Cliente clienteDos = new Cliente("Homero",22);
		Cliente clienteTres = new Cliente("juan",120);
		Cliente clienteCuatro = new Cliente("ro",21);
		
		elBar.entraCliente(clienteUno);
		elBar.entraCliente(clienteDos);
		elBar.entraCliente(clienteTres);
		elBar.entraCliente(clienteCuatro);
		Integer clientesQuePuedenEntrar =3;
		Assert.assertEquals(3, elBar.getClientes().size());
		
	}
	
	@Test
	public void testOrdenarPorNombre(){
		BarHomero elBar = new BarHomero();
		Cliente clienteUno = new Cliente("C",21);
		Cliente clienteDos = new Cliente("A",22);
		Cliente clienteTres = new Cliente("B",120);
		
		elBar.entraCliente(clienteUno);
		elBar.entraCliente(clienteDos);
		elBar.entraCliente(clienteTres);
		/*toString visto en clase*/
		System.out.println(""+elBar.getClientes());
		String nombreEsperado="A";
		Assert.assertEquals(nombreEsperado, elBar.getClientes().first().getNombre());
	}
	
	@Test
	public void testOrdenarPorEdad(){
		CompararPorEdad comarar = new CompararPorEdad();
		BarHomero elBar = new BarHomero(comarar);
		Cliente clienteDos = new Cliente("Homero",50);
		Cliente clienteTres = new Cliente("Carlos",25);
		Cliente clienteUno = new Cliente("Carlos",22);
		
	
		elBar.entraCliente(clienteUno);
		elBar.entraCliente(clienteDos);
		elBar.entraCliente(clienteTres);
		Integer edadEsperadaAlComienzo= 22;
		Assert.assertEquals(edadEsperadaAlComienzo, elBar.getClientes().first().getEdad());
		Integer edadEsperadaAlFinal= 50;
		Assert.assertEquals(edadEsperadaAlFinal, elBar.getClientes().last().getEdad());
	}
	
	@Test
	public void testCompararClientes(){
		/*Esta parte no la pude solucionar,*/
		Cliente clienteUno = new Cliente("b",27);
		Cliente clienteDos = new Cliente("a",27);
		
		/*b es menor q a en codigo ascii*/
		Boolean clienteUnoEsMayor = clienteUno.compareTo(clienteDos) > 0;
		assertEquals(true, clienteUnoEsMayor);
		Assert.assertFalse(clienteUno.equals(clienteDos));
		
	}

}
