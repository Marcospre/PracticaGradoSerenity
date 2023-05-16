package home;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import modelos.Ordenador;
import modelos.Telefono;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla;
import utiles.esperas.Espera;

public class SeleccionarDispositivo extends UIInteractionSteps {
	
	HomePage homePage;
	Espera espera;
	
	
	@Step("El usuario selecciona un telefono")
	public Telefono selecionaElTelefono(io.cucumber.datatable.DataTable dataTable, int contador) {
		dataTable = dataTable.subTable(1, 0, dataTable.height(), dataTable.width());
		List<List<String>> rows = dataTable.asLists(String.class);
		
		for(List<String> row : rows) {
			Telefono.agregarTelefono(new Telefono(row.get(0)));
		}
//		numTelefonos = Telefono.telefonos.size();
		espera.hastaQueLaPaginaCargue(20);
		
		String nombreTelefono = Telefono.TELEFONOS.get(contador-1).devolverNombre();
		
		
		Espera.obligatoriamente(1000);
		AlmacenRutasDeCapturaPantalla.guardarRuta("Selecciona el telefono", "selecionarTelefono");
		this.clicoEnElDispositivo(nombreTelefono);
		return Telefono.TELEFONOS.get(contador-1);
	}
	
	@Step("El usuario selecciona un ordenador")
	public Ordenador selecionaElOrdenador(io.cucumber.datatable.DataTable dataTable, int contador) {
		dataTable = dataTable.subTable(1, 0, dataTable.height(), dataTable.width());
		List<List<String>> rows = dataTable.asLists(String.class);
		
		for(List<String> row : rows) {
			Ordenador.agregarOrdenador(new Ordenador(row.get(0)));
		}
//		numTelefonos = Telefono.telefonos.size();
		espera.hastaQueLaPaginaCargue(20);
		
		String nombreOrdenador = Ordenador.ORDENADORES.get(contador-1).devolverNombre();
		
		
		Espera.obligatoriamente(1000);
		AlmacenRutasDeCapturaPantalla.guardarRuta("Selecciona el ordenador", "selecionarOrdenador");
		this.clicoEnElDispositivo(nombreOrdenador);
		return Ordenador.ORDENADORES.get(contador-1);
	}
	
	private void clicoEnElDispositivo(String nombre) {
		WebElement telefonoElegido = homePage.find(By.xpath("//a[contains(text(),'"+nombre+"')]"));
		espera.queSeaVisible(Duration.ofSeconds(15), telefonoElegido);
		espera.queSeaClicable(Duration.ofSeconds(15), telefonoElegido);
		telefonoElegido.click();
	}

}
