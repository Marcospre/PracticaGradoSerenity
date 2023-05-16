package utiles.capturasPantalla;

public class AlmacenRutasDeCapturaPantalla {
	public static int VALOR_RUTA=6;
    public static String Ruta_Escenario="";
    public static void setValorRuta(int valor) {
        VALOR_RUTA=valor;
    }
    
    public static void guardarRuta(String descripcion, String tituloImagen) {
        if(VALOR_RUTA==0) {
            CapturaPantalla.guardarCapturaPantalla(CapturaPantalla.RUTAS_IMAGENES[0]+Ruta_Escenario+"/",descripcion,tituloImagen);
        }else if(VALOR_RUTA==1) {
            CapturaPantalla.guardarCapturaPantalla(CapturaPantalla.RUTAS_IMAGENES[1]+Ruta_Escenario+"/",descripcion,tituloImagen);
        }else if(VALOR_RUTA==2) {
            CapturaPantalla.guardarCapturaPantalla(CapturaPantalla.RUTAS_IMAGENES[2]+Ruta_Escenario+"/",descripcion,tituloImagen);
        }else {
        
            System.out.println("NO HAY MAS RUTAS ESTABLECIDAS");
        }
    }
}
