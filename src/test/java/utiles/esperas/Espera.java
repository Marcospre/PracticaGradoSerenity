package utiles.esperas;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.steps.UIInteractionSteps;


/*
 *   hay 4 tipos de condiciones de espera:
 *   1º espera un webelement
 *   2º esepra un Frame
 *   3º espera un boolean
 *   4º espera un Alert
 * 
 * 
 * 
 * */
public class Espera extends UIInteractionSteps {


	//ElementNotVisibleException. : webelement NO presente en el DOM
	
	
	//numberOfElementsToBeLessThan: devuelve una Lista de WebElements si la cantidad de WebElements ubicados usando el localizador web (pasado como argumento) es menor que la esperada number (también pasado como argumento).
	//frameToBeAvailableAndSwitchToIt : cambia de FRAME usando By.Id o By.name
	//textToBePresentInElementLocated : devulve true si el webelement contiene el texto indicado por parametro
	
	public  void pararCarga() {
		 JavascriptExecutor executor=(JavascriptExecutor) getDriver();
			executor.executeScript("window.stop();");

	 }
	
	public void hastaQueLaPaginaCargue(int tiempo) {
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(tiempo));//TimeoutException
		}
	public void  queTermineLaCargaAsincrona(int tiempo) {
		getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(tiempo));

	}

	public static void obligatoriamente(long tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// visible y habilitado
	public void queSeaClicable(Duration tiempo, WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	//  visible y habilitado
		public void queSeaClicable(Duration tiempo, WebElement element, Duration tiempo2) {
			FluentWait<WebDriver> wait = new WebDriverWait(getDriver(), tiempo)
					.pollingEvery(tiempo2)
					.ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.elementToBeClickable(element));

		}
		public void queSeaClicable(Duration tiempo, By xpath) {
			WebElement element=getDriver().findElement(xpath);
			WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
	
	// presente, visible, hablilitado y NO estar oculto por otro elemento
	public void queSeaVisible(Duration tiempo, WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void queSeaVisible(Duration tiempo, List <WebElement> elementos) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.visibilityOfAllElements(elementos));
	}
	
	public void queRefresqueComponentePadre_Y_seaVisibleElComponenteHijo(Duration tiempo, WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.refreshed(       //StaleElementReferenceException
		        ExpectedConditions.visibilityOf(element)));
	}
	public void queRefresquenLosComponentes(Duration tiempo,List <WebElement> elements) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.refreshed(       //StaleElementReferenceException
		        ExpectedConditions.visibilityOfAllElements(elements)));
	}

	public void queRefresqueComponentePadre(Duration tiempo, WebElement element, By xpath) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, xpath));

	}
	//se usa despues de haber abierto un menu con opciones..y tenemos que elegir una opcion
	public void queSeaVisibleDespuesDeLLamarAlPadre(long tiempo, By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tiempo));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}



	//cuando el elemento SI está seleccionado y queremos utilizarlo
	public void queSeaSeleccionado(Duration tiempo, WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	//cuando un elemento NO está seleccionado y queremos seleccionarlo
	public void queSeleccioneElComponente(long tiempo, WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tiempo));
		wait.until(ExpectedConditions.elementSelectionStateToBe(element, false));
	}
	
	
//ALERT ------------------------------------------------------------
	//devulve un Alert si esta presente en la pagina
	//webdriver cambia a la ventana Alert y con eso ya podemos aceptar, descartar, enviartexto...
	public void queSeaVisibleAlerta(Duration tiempo) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempo);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	
	
	//DEVUEVEN FRAME ---------------------------------------------
	//realiza el cambio de frame automaticamanete
	public void queCambieDeFrame(long tiempo, String xpath) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tiempo));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpath))); 

	}
	
	
	public void esperarHastaAlertVisible(int time) {
		 WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.alertIsPresent());
	}
	

	
	
	public void abrirNuevaPestaniaNavegador() {
		//this.implicitamente(10);  
		//#abrimos la nueva pestaña  AVERIGUAR COMO SE USA
		//getDriver().execute_script("window.open('https://www.qalovers.com', 'new tab')");
	}



	/*
	 * is displayed()  se visualiza(), no tiene la propiedad hidden
	 * 
	 * 
	 * is enabled()    esta habilitado() o activado (). Cuando un botón está habilitado se puede pulsar.
	 * 
	 * 
	 * is selected()   está seleccionado(). Se refiere a los checkbox, que pueden estar seleccionado o no.
	 * 
	 * 
	 * */

	public void hastaQueHagaScroll() {
		JavascriptExecutor js = ((JavascriptExecutor) getDriver());
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
