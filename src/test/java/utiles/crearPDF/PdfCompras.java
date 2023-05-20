package utiles.crearPDF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import io.cucumber.java.Scenario;
import modelos.Ordenador;
import modelos.Telefono;
import modelos.Usuarios;
import utiles.componentesDelPdf.CreadorPdf;
import utiles.componentesDelPdf.Descripcion;
import utiles.componentesDelPdf.Ordenadores;
import utiles.componentesDelPdf.Sprint;
import utiles.componentesDelPdf.Telefonos;
import utiles.componentesDelPdf.TituloPortada;
import utiles.componentesDelPdf.Usuario;

public class PdfCompras {

	public static String Ruta_Archivo="";
	public static final String Ruta_Raiz = "./Docu/";
	public static String Ruta_Escenario="";
	public static String Ruta_Final="";
	static boolean Creada_Ruta_Generica_Login =true;
	static String Ruta_Plantilla = "";
	
	//esta funcion solo debe ejecutarse la primera vez que se llama en FactoriaPDF
	public static boolean crearArchvivo(String rutaEscenario) {
	       System.out.println("crear ruta "  + Ruta_Raiz+rutaEscenario+"/"+rutaEscenario+1+".pdf" );
	
		 Creada_Ruta_Generica_Login = CreadorPdf.crearArchivo(Ruta_Raiz+rutaEscenario+"/"+rutaEscenario+ 1 + ".pdf");
	       System.out.println("HA SIDO CREADA? " + Creada_Ruta_Generica_Login);
		 return Creada_Ruta_Generica_Login;
	}
	
	public static void crearPdfComprasTelefonos(int vueltaEjecucion, String rutaEscenario, TituloPortada tituloPortada, Descripcion descripcion, Sprint sprint) {
		Ruta_Escenario=rutaEscenario;
		Ruta_Final=Ruta_Raiz+Ruta_Escenario+"/"; //creamos la ruta para el escenario
		Ruta_Archivo=Ruta_Final+ rutaEscenario;//creamos la ruta para el archvivo
		Ruta_Plantilla = Ruta_Raiz + rutaEscenario +"/plantilla.pdf";
		CreadorPdf.IMAGENES_PARA_PDF = utiles.capturasPantalla.CapturaPantalla.ImagenesPNG;
		Creada_Ruta_Generica_Login=true;
		
		if (Creada_Ruta_Generica_Login) {

			if (vueltaEjecucion == 1) {
				System.out.println("vuelta 1 " + Ruta_Archivo);
				CreadorPdf.escribePlantilla(Ruta_Plantilla, tituloPortada, descripcion,sprint);

					CreadorPdf.escribeDocumentoTele(Ruta_Archivo + vueltaEjecucion + ".pdf",
							CreadorPdf.IMAGENES_PARA_PDF, Telefonos.TELEFONOS[vueltaEjecucion - 1]);
				
				
			}else {
				System.out.println("vuelta "+vueltaEjecucion+ Ruta_Archivo);
				CreadorPdf.escribeDocumentoTele(Ruta_Archivo + vueltaEjecucion + ".pdf",CreadorPdf.IMAGENES_PARA_PDF, 
						Telefonos.TELEFONOS[vueltaEjecucion - 1]);
				if (vueltaEjecucion == Telefono.TELEFONOS.size()) {
					String[] rutasArchivos = new String[Telefono.TELEFONOS.size()+1];
					rutasArchivos[0] = Ruta_Plantilla;
					for(int i = 1; i < Telefono.TELEFONOS.size()+1;i++) {
						rutasArchivos[i] = Ruta_Archivo+i+".pdf";
					}
					// System.out.println("RUTA FINAL ANTES DE FUSIONAR "+ RutasPdf.RUTA_PDF_LOGIN_FINAL.getTexto());
					
					CreadorPdf.fusionaPdfs(Ruta_Archivo+"FinalTelefonos.pdf", rutasArchivos);
				}
			}
		}
	}
	
	public static void crearPdfComprasOrdenadores(int vueltaEjecucion, String rutaEscenario, TituloPortada tituloPortada, Descripcion descripcion, Sprint sprint) {
		Ruta_Escenario=rutaEscenario;
		Ruta_Final=Ruta_Raiz+Ruta_Escenario+"/"; //creamos la ruta para el escenario
		Ruta_Archivo=Ruta_Final+ rutaEscenario;//creamos la ruta para el archvivo
		Ruta_Plantilla = Ruta_Raiz + rutaEscenario +"/plantilla.pdf";
		CreadorPdf.IMAGENES_PARA_PDF = utiles.capturasPantalla.CapturaPantalla.ImagenesPNG;
		Creada_Ruta_Generica_Login=true;
		
		if (Creada_Ruta_Generica_Login) {

			if (vueltaEjecucion == 1) {
				System.out.println("vuelta 1 " + Ruta_Archivo);
				CreadorPdf.escribePlantilla(Ruta_Plantilla, tituloPortada, descripcion,sprint);

					CreadorPdf.escribeDocumentoOrde(Ruta_Archivo + vueltaEjecucion + ".pdf",
							CreadorPdf.IMAGENES_PARA_PDF, Ordenadores.ORDENADORES[vueltaEjecucion - 1]);
				
				
			}else {
				System.out.println("vuelta "+vueltaEjecucion+ Ruta_Archivo);
				CreadorPdf.escribeDocumentoOrde(Ruta_Archivo + vueltaEjecucion + ".pdf",CreadorPdf.IMAGENES_PARA_PDF, 
						 Ordenadores.ORDENADORES[vueltaEjecucion - 1]);
				if (vueltaEjecucion == Ordenadores.ORDENADORES.length) {
					String[] rutasArchivos = new String[Ordenadores.ORDENADORES.length+1];
					rutasArchivos[0] = Ruta_Plantilla;
					for(int i = 1; i < Ordenadores.ORDENADORES.length+1;i++) {
						rutasArchivos[i] = Ruta_Archivo+i+".pdf";
					}
					// System.out.println("RUTA FINAL ANTES DE FUSIONAR "+ RutasPdf.RUTA_PDF_LOGIN_FINAL.getTexto());
					
					CreadorPdf.fusionaPdfs(Ruta_Archivo+"FinalOrdenadores.pdf", rutasArchivos);
				}
			}
		}
	}
}
	

