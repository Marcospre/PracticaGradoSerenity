package utiles.crearPDF;


import utiles.componentesDelPdf.Descripcion;
import utiles.componentesDelPdf.Sprint;
import utiles.componentesDelPdf.TituloPortada;

public class FactoriaPDF {
	 
	 
	   public static void crearPdf(int valorRuta, int vueltaEjecucion, String nombreEsceneario, TituloPortada tituloPortada,
	            Descripcion descripcion, Sprint sprint) {
		   
		   if (valorRuta == 0 || valorRuta == 1) {
	            if (vueltaEjecucion == 1) {
	                PdfCompras.crearArchvivo(nombreEsceneario);
	                PdfCompras.crearPdfCompras(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
	               
	            } else {
	            	PdfCompras.crearPdfCompras(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
	            }
		   }
		   
		   
//	        if (valorRuta == 0) {
//	            if (vueltaEjecucion == 1) {
//	                PdfLogin.crearArchvivo(nombreEsceneario);
//	                PdfLogin.crearPdfRegistro(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	               
//	            } else
//	                PdfLogin.crearPdfRegistro(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	        }else if(valorRuta == 1) {
//	        	if (vueltaEjecucion == 1) {
//	                PdfLogin.crearArchvivo(nombreEsceneario);
//	                PdfLogin.crearPdfLogin(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	               
//	            } else
//	                PdfLogin.crearPdfLogin(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	        }else if(valorRuta == 2) {
//	        	if (vueltaEjecucion == 1) {
//	                PdfLogin.crearArchvivo(nombreEsceneario);
//	                PdfLogin.crearPdfCesta(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	               
//	            } else
//	                PdfLogin.crearPdfCesta(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	        }else if(valorRuta == 3) {
//	        	PdfLogin.crearPdfTabla(nombreEsceneario, tituloPortada, descripcion, sprint,Telefono.telefonos);
//	        }
	        
	   }
	   
//	   public static void crearPdfRegistro(int valorRuta, int vueltaEjecucion, String nombreEsceneario, TituloPortada tituloPortada,
//	            Descripcion descripcion, Sprint sprint) {
//	        if (valorRuta == 0) {
//	            if (vueltaEjecucion == 1) {
//	                PdfLogin.crearArchvivo(nombreEsceneario);
//	                PdfLogin.crearPdfRegistro(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	               
//	            } else
//	                PdfLogin.crearPdfRegistro(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	        }
//	   }
//	   
//	   public static void crearPdfLogin(int valorRuta, int vueltaEjecucion, String nombreEsceneario, TituloPortada tituloPortada,
//	            Descripcion descripcion, Sprint sprint) {
//	        if (valorRuta == 1) {
//	            if (vueltaEjecucion == 1) {
//	                PdfLogin.crearArchvivo(nombreEsceneario);
//	                PdfLogin.crearPdfLogin(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	               
//	            } else
//	                PdfLogin.crearPdfLogin(vueltaEjecucion, nombreEsceneario, tituloPortada, descripcion, sprint);
//	        }
//	   }
	     
}

