package home;



import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.esperas.Espera;

public class DevolverMensaje extends UIInteractionSteps {
	
	Espera espera;
	private HomePage homePage;
	
	@Step("Compruebo el mensaje de bienvenida")
	public String deBienvenida()  {
			waitFor(HomePage.mensajeWelcome);
//			espera.esperarHastaVisible(HomePage.mensajeWelcome, 3000);
			return HomePage.mensajeWelcome.getText();
		
	}
}
