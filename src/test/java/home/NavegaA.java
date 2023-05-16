package home;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebElement;

import home.cesta.CestaPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla;
import utiles.esperas.Espera;


public class NavegaA extends UIInteractionSteps{
	
	HomePage homePage;
	Espera espera;
	
	public NavegaA() {
		HomePage.cargarLosEnlaces();
		espera = new Espera();
	}
	
	@Step("Navega a la pestaña login")
	public void aLogin() {
		for (WebElement enlace : homePage.ENLACES) {
			espera.queSeaClicable(Duration.ofSeconds(15), homePage.LOGIN);
			if (enlace.equals(homePage.LOGIN)) {
				Espera.obligatoriamente(1000);
				AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña Login", "irALogin");
				enlace.click();
				break;
				
			}
		}
	}
	
	@Step("Navega a la pestaña home")
	public void aHome() {
		for (WebElement enlace : homePage.ENLACES) {
			espera.queSeaClicable(Duration.ofSeconds(15), homePage.HOME);
			if (enlace.equals(homePage.HOME)) {
				
				Espera.obligatoriamente(1000);
				AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña Home", "irAHome");
				enlace.click();
				break;
				
			}
		}
	}
	
	@Step("Navega a la pestaña cesta")
	public void aCesta() {
//		for (WebElement enlace : homePage.ENLACES) {
//			espera.queSeaVisible(Duration.ofSeconds(15), homePage.CESTA);
//			espera.queSeaClicable(Duration.ofSeconds(15), homePage.CESTA);
////			espera.obligatoriamente(1000);
//			if (enlace.equals(homePage.CESTA)) {
//				Espera.obligatoriamente(1000);
//				AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña Cesta", "irACesta");
//				enlace.click();
//				break;
//				
//			}
//		}
		Espera.obligatoriamente(1000);
		AlmacenRutasDeCapturaPantalla.guardarRuta("se dirige a la pestaña Cesta", "irACesta");
		espera.queSeaClicable(Duration.ofSeconds(15), homePage.CESTA);
		homePage.CESTA.click();
	}
}


