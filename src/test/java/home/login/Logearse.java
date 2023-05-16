package home.login;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.Keys;



import modelos.Usuarios;
import utiles.capturasPantalla.AlmacenRutasDeCapturaPantalla;
import utiles.esperas.*;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;


public class Logearse extends UIInteractionSteps{
	
	Espera espera = new Espera();
	LoginPage login ;
	
	 @Step("el usuario escribe su usuario {usuario}, su password {password} y pulsa el boton Login")
	    public void conUsuarioYpassword(String usuario, String password) {
		
		 
	    	this.rellenarUsuario(usuario);
	    	this.rellenarPassword(password);
		    this.pulsarBotonLogin();
			Espera.obligatoriamente(1000);
	 }
	
	@Step("clikar login")
	public void pulsarBotonLogin() {
		LoginPage.loginButton.click();
		
	}
	
	 private void rellenarUsuario(String usuario) {
		 //   Espera.espera(500);
	   	espera.queSeaClicable(Duration.ofSeconds(15),  LoginPage.campoUsuario);
	   		LoginPage.campoUsuario.sendKeys(usuario + Keys.ENTER);
	        AlmacenRutasDeCapturaPantalla.guardarRuta("El usuario rellena el campo usuario" ,"EscribirUsuario");
	 }


	 private void rellenarPassword(String pass) {
			// Espera.espera(500);
		     	espera.queSeaClicable(Duration.ofSeconds(15),  LoginPage.campoPassword);
		     	LoginPage.campoPassword.sendKeys(pass + Keys.ENTER);
		        AlmacenRutasDeCapturaPantalla.guardarRuta( "El usuario rellena el campo password", "EscribirPassword");	        
		 }
}
