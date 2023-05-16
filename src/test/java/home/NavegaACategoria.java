package home;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla;
import utiles.esperas.Espera;

public class NavegaACategoria extends UIInteractionSteps {
	
	HomePage homePage = new HomePage();
	Espera espera;
	
	public NavegaACategoria() {
		HomePage.cargarLosEnlacesCategoria();
		espera = new Espera();
	}
	
	@Step("Navega a la pestaña PHONES")
	public void phones() {
		for (WebElement categoria : homePage.CATEGORIAS) {

			if (categoria.equals(HomePage.PHONES)) {
				Espera.obligatoriamente(1000);
				AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña PHONES", "irAPHONES");
				categoria.click();
				break;
				
			}
		}
	}
	
	@Step("Navega a la pestaña LAPTOPS")
	public void laptops() {
		
//		for (WebElement categoria : homePage.CATEGORIAS) {
//			espera.queSeaClicable(Duration.ofSeconds(15), homePage.LAPTOPS);
//			if (categoria.equals(homePage.LAPTOPS)) {
//				JOptionPane.showMessageDialog(null, "Paso por aqui");
//				Espera.obligatoriamente(1000);
//				AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña LAPTOPS", "irALAPTOPS");
//				categoria.click();
//				break;
//				
//			}
//		}
		Espera.obligatoriamente(1000);
		AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña LAPTOPS", "irALAPTOPS");
		espera.queSeaClicable(Duration.ofSeconds(15), homePage.LAPTOPS);
		homePage.LAPTOPS.click();
		
	}
	
	@Step("Navega a la pestaña MONITORS")
	public void monitors() {
		for (WebElement categoria : homePage.CATEGORIAS) {

			if (categoria.equals(homePage.MONITORS)) {
				Espera.obligatoriamente(1000);
				AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña MONITORS", "irAMONITORS");
				categoria.click();
				break;
				
			}
		}
	}
}
