package home.telefono;



import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.esperas.Espera;

public class NavegacionTelefono extends UIInteractionSteps {
	
	TelefonoPage telefono;
	Espera espera;
	
	@Step("cliko en la cart")
	public void irACesta() {
//		espera.esperarHastaClikable(TelefonoPage.botonIrACesta, 3000);
		TelefonoPage.botonIrACesta.click();
	}
}
