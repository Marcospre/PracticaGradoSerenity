package inicio;

import home.HomePage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.esperas.Espera;

public class Arrancar extends UIInteractionSteps {
	InicioPage inicioPage;
	
	@Step("Abrir Pagina")
	public void pagina() {
		inicioPage.open();
		
		Espera.obligatoriamente(1000);
		utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla.guardarRuta("El usuario entra en la aplicacion", "abrirAplicacion");
		
		
	}
}
