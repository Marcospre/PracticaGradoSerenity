package home.cesta;

import java.time.Duration;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import modelos.Telefono;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla;
import utiles.componentesDelPdf.Telefonos;
import utiles.esperas.Espera;

public class VerificarCesta extends UIInteractionSteps {
	
	CestaPage cesta;
	Espera espera;
	
	@Step("Comprueba que el dispositivo añadido este en la cesta")
	public boolean existeDispositivo(String nombre) {
		boolean devolver = false;
		
		espera.queSeaClicable(Duration.ofSeconds(4), CestaPage.table);
//		List<WebElement> telefonos = CestaPage.table.findElements(By.tagName("/tr/td[2]"));
		
		espera.obligatoriamente(1000);
		AlmacenRutasDeCapturaPantalla.guardarRuta("Realiza las verificaciones", "Verficaciones");
		
		List<WebElement> nombresDispositivos = CestaPage.table.findElements(By.xpath("//tr/td[2]"));
		for(int i=0; i < nombresDispositivos.size();i++) {

				if(nombresDispositivos.get(i).getText().equalsIgnoreCase(nombre)) {
					devolver = true;
					break;
				}
			
		}
		return devolver;
	}
	
	@Step("Verifica que los datos son correctos")
	public boolean datosCorrectos(String nombre, String precio) {
		boolean devolver = false;
		
		espera.queSeaClicable(Duration.ofSeconds(4), CestaPage.table);
		List<WebElement> nombresDispositivos = CestaPage.table.findElements(By.xpath("//tr/td[2]"));
		for(int i=0; i < nombresDispositivos.size();i++) {
			
				if(nombresDispositivos.get(i).getText().equalsIgnoreCase(nombre)) {
					WebElement precioDispositivo = CestaPage.table.findElement(By.xpath("//tr["+(i+1)+"]/td[3]"));
		
					if(precioDispositivo.getText().equalsIgnoreCase(precio)) {
						devolver = true;
						break;
				}
			
		}
		
	}
		return devolver;
	}
}
