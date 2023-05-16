package modelos;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
	
	public String nombre;
	public String precio;
	public int unidad;
	public static List<Ordenador> ORDENADORES = new ArrayList<Ordenador>();
	
	public Ordenador(String nombre) {
		this.nombre = nombre;	
	}
	
	public Ordenador(String nombre, String precio, int unidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidad = unidad;
	}
	
	public static void agregarOrdenador(Ordenador ordenador) {
		ORDENADORES.add(ordenador);
	}
	
	public String devolverNombre() {
		return this.nombre;
	}
}
