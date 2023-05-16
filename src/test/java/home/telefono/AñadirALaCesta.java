package home.telefono;



import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla;
import utiles.esperas.Espera;

public class AñadirALaCesta extends UIInteractionSteps  {
	
	TelefonoPage telefonoPage;
	static Espera espera;
	AlmacenRutasDeCapturaPantalla alamacen;
	
	@Step("Añadir a la cesta")
	public void aCesta() {
		
		
		espera.obligatoriamente(1000);
		AlmacenRutasDeCapturaPantalla.guardarRuta("Añade el telefono a la cesta", "añadirALaCesta");
		
		TelefonoPage.botonCesta.click();
		
		espera.esperarHastaAlertVisible(3000);
		
		this.getDriver().switchTo().alert().accept();
		
		
	}
	
	public String antesDimePrecio() {
		return TelefonoPage.campoPrecio.getText().substring(1, 4);
	}
}	
