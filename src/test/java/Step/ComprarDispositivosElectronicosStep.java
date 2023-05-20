package Step;

import static org.junit.Assert.assertTrue;

import java.util.List;


import home.Abrir;
import home.NavegaA;
import home.NavegaACategoria;
import home.SeleccionarDispositivo;
import home.cesta.VerificarCesta;
import home.login.Logearse;
import home.telefono.AñadirALaCesta;
import inicio.Arrancar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modelos.Login;
import net.thucydides.core.annotations.Steps;

public class ComprarDispositivosElectronicosStep {
	
	String escenario = "";
	modelos.Telefono telefono;
	modelos.Ordenador ordenador;
	@Steps
	Abrir abrir;
	@Steps
	NavegaA navega;
	@Steps
	NavegaACategoria navegaACategoria;
	@Steps
	Logearse logearse;
	@Steps
	SeleccionarDispositivo seleccionarDispositivo;
	@Steps
	AñadirALaCesta añadir;
	@Steps
	VerificarCesta verificar;
	@Steps
	Arrancar arrancar;
	
	@Given("el usuario ingresa en DEMOBLAZE")
	public void el_usuario_ingresa_en_demoblaze() {
	    // Write code here that turns the phrase above into concrete actions
	    arrancar.pagina();
	}
	@Given("el usuario se direge a la pestaña login")
	public void el_usuario_se_direge_a_la_pestaña_login() {
	    // Write code here that turns the phrase above into concrete actions
	    navega.aLogin();
	}
	@Given("el usuario se logea correctamente")
	public void el_usuario_se_logea_correctamente(io.cucumber.datatable.DataTable dataTable) {
	  
		List<List<String>> rows = dataTable.asLists(String.class);
		for (List<String> row : rows) {
			Login.agregar(new Login(row.get(0), row.get(1)));
		}
		
		logearse.conUsuarioYpassword(Login.LISTA_DE_LOGIN.get(1).nombre, Login.LISTA_DE_LOGIN.get(1).password);
		
	}
		
	@When("el usuario se encuentra en la pagina home")
	public void el_usuario_se_encuentra_en_la_pagina_home() {
	    // Write code here that turns the phrase above into concrete actions
	    navega.aHome();
	}
	
	@When("el usuario se dirige a la categoria de ordenadores")
	public void el_usuario_se_dirige_a_la_categoria_de_ordenadores() {
	    // Write code here that turns the phrase above into concrete actions
		navegaACategoria.laptops();
		escenario = "laptops";
	}
	
	@When("el usuario clika en el ordenador")
	@When("el usuario clika en el telefono")
	public void el_usuario_clika_en_el_dispositivo(io.cucumber.datatable.DataTable dataTable) {
		
		if(!escenario.equalsIgnoreCase("laptops"))
			telefono = seleccionarDispositivo.selecionaElTelefono(dataTable, Hooks.CONTADOR);
		else
			ordenador = seleccionarDispositivo.selecionaElOrdenador(dataTable, Hooks.CONTADOR);
		
	}
	@When("el usuario añade a la cesta el ordenador")
	@When("el usuario añade a la cesta el telefono movil")
	public void el_usuario_añade_a_la_cesta_el_dispositivo() {
	    // Write code here that turns the phrase above into concrete actions
		if(!escenario.equalsIgnoreCase("laptops"))
			telefono.precio = añadir.antesDimePrecio();
		else
			ordenador.precio = añadir.antesDimePrecio();
	    añadir.aCesta();
	}
	@When("el usuario se dirige a la cesta de la compra")
	public void el_usuario_se_dirige_a_la_cesta_de_la_compra() {
	    // Write code here that turns the phrase above into concrete actions
		navega.aHome();
		navega.aCesta();
	}
	@Then("el usuario verifica que el telefono se ha añadido y que los datos son correctos")
	public void el_usuario_verifica_que_el_telefono_se_ha_añadido_y_que_los_datos_son_correctos() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(verificar.existeDispositivo(telefono.nombre));
	    assertTrue(verificar.datosCorrectos(telefono.nombre, telefono.precio));
	}

	@Then("el usuario verifica que el ordenador con el {string} se ha añadido y que los datos son correctos")
	@Then("el usuario verifica que el telefono con el {string} se ha añadido y que los datos son correctos")
	public void el_usuario_verifica_que_el_dispositivo_con_el_se_ha_añadido_y_que_los_datos_son_correctos(String nombre) {
	    // Write code here that turns the phrase above into concrete actions
		 assertTrue(verificar.existeDispositivo(nombre));
		 if(!escenario.equalsIgnoreCase("laptops"))
			assertTrue(verificar.datosCorrectos(nombre, telefono.precio));
		 else
			 assertTrue(verificar.datosCorrectos(nombre, ordenador.precio));
	}
}
