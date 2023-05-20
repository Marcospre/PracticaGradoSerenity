package modelos;

import java.util.ArrayList;
import java.util.List;

import utiles.componentesDelPdf.Usuario;

public class Telefono {
	
	
	
	public String nombre;
	public String precio;
	public int unidad;
	public static int contador=1;
	public static List<Telefono> TELEFONOS = new ArrayList<Telefono>();
	
	public static String nombresTele[] = { "Telefono1", "Telefono2", "Telefono3"};
	
	public Telefono(String nombre) {
		this.nombre = nombre;	
	}
	
	public Telefono(String nombre, String precio, int unidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidad = unidad;
	}
	
	public static void agregarTelefono(Telefono telefono) {
		TELEFONOS.add(telefono);
	}
	public String devolverNombre() {
		return this.nombre;
	}
	
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public void setUnidad(int uni) {
		this.unidad = this.unidad + uni;
	}
	
	public String devolverPrecio() {
		return this.precio;
	}
	
//	public static Telefono mayor() {
//		Telefono mayor = TELEFONOS.get(0);
//		for(Telefono tele:TELEFONOS) {
//			if(tele.precio > mayor.precio) {
//				mayor = tele;
//			}
//		}
//		
//		return mayor;
//	}
//	
//	public static Telefono menor() {
//		Telefono menor = TELEFONOS.get(0);
//		for(Telefono tele:TELEFONOS) {
//			if(tele.precio < menor.precio) {
//				menor = tele;
//			}
//		}
//		return menor;
//	}
//	
//	public static double total() {
//		double total = 0;
//		for(Telefono tele:TELEFONOS) {
//			total = total+tele.precio*tele.unidad;
//		}
//		return total;
//	}
}