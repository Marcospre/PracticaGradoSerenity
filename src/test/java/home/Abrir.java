package home;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.capturasPantalla.CapturaPantalla;
import utiles.esperas.Espera;

public class Abrir extends UIInteractionSteps {
	
	HomePage homePage;
	
	@Step("Abrir Home")
	public void paginaHome() {
		homePage.open();
		
		Espera.obligatoriamente(1000);
		utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla.guardarRuta("El usuario entra en la aplicacion", "abrirHome");
		
		
	}

}
