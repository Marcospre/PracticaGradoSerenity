package utiles.capturasPantalla;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class CapturaPantalla extends UIInteractionSteps{
    public static String RUTA_IMAGEN_TELEFONOS="./Docu/@CompraTelefonos/";
    public static String RUTA_IMAGEN_ORDENADORES="./Docu/@CompraOrdenadores/";
    public static String RUTA_IMAGEN_LOGIN="./Docu/@Logear/";
    public static String RUTA_IMAGEN_CESTA="./Docu/@Cesta/";

    public static String RUTAS_IMAGENES[]= {
            RUTA_IMAGEN_TELEFONOS,
            RUTA_IMAGEN_ORDENADORES,
            RUTA_IMAGEN_LOGIN,
            RUTA_IMAGEN_CESTA
    };
    
    public static Map<String,File>ImagenesPNG=new LinkedHashMap<String, File>();
    
    public static int CONTADOR_VUELTAS_APLICACION=1;
    
    public static void guardarCapturaPantalla(String ruta,String descripcion, String titulo) {
        File file=((TakesScreenshot)Serenity.getDriver()).getScreenshotAs(OutputType.FILE);
           try {
               FileUtils.copyFile(file, new File(ruta+titulo+CONTADOR_VUELTAS_APLICACION+".png"));
               file=new File(ruta+titulo+CONTADOR_VUELTAS_APLICACION+".png");
               ImagenesPNG.put(descripcion,file);
       
                   
           } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
       
   }
}


