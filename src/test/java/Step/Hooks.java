package Step;

import java.util.Collection;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import modelos.Telefono;
import utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla;
import utiles.componentesDelPdf.Descripcion;
import utiles.componentesDelPdf.Sprint;
import utiles.componentesDelPdf.TituloPortada;
import utiles.crearPDF.FactoriaPDF;

public class Hooks {
	
	public static int CONTADOR = 1;
	private String rutaEscenario = "";
	
	@Before("@CompraTelefonos or @CompraOrdenadores")
	public void setUp(Scenario scenario) {
		Telefono.TELEFONOS.clear();
		Collection<String> etiquetas = scenario.getSourceTagNames();
		for(String etiqueta: etiquetas) {
			rutaEscenario = etiqueta;     
		}
		utiles.capturasPantalla.CapturaPantalla.CONTADOR_VUELTAS_APLICACION = CONTADOR;
//		AlmacenRutasDeCapturaPantalla.Ruta_Escenario = rutaEscenario;
		if(rutaEscenario.equalsIgnoreCase("@CompraTelefonos"))
			AlmacenRutasDeCapturaPantalla.setValorRuta(0);
		else if(rutaEscenario.equalsIgnoreCase("@CompraOrdenadores"))
			AlmacenRutasDeCapturaPantalla.setValorRuta(1);
	}
	
	@After("@CompraTelefonos or @CompraOrdenadores")
	public void cerrar() {
		if(rutaEscenario.equalsIgnoreCase("@CompraTelefonos")) 
			FactoriaPDF.crearPdf(AlmacenRutasDeCapturaPantalla.VALOR_RUTA,CONTADOR, rutaEscenario, TituloPortada.TITULO_COMPRAS_MOVIlES, Descripcion.DESCRIPCION_COMPRA_MOVILES, Sprint.Sprint1);
		else if(rutaEscenario.equalsIgnoreCase("@CompraOrdenadores"))
			FactoriaPDF.crearPdf(AlmacenRutasDeCapturaPantalla.VALOR_RUTA,CONTADOR, rutaEscenario, TituloPortada.TITULO_COMPRAS_ORDENADORES, Descripcion.DESCRIPCION_COMPRA_ORDENADORES, Sprint.Sprint1);
		
		CONTADOR++;
	}
}
