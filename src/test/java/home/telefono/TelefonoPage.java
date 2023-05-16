package home.telefono;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class TelefonoPage extends PageObject {
	
	@FindBy(xpath="//a[normalize-space()='Add to cart']")
	static WebElement botonCesta;
	
	@FindBy(xpath="//a[@id='cartur']")
	static WebElement botonIrACesta;
	
	@FindBy(className="price-container")
	static WebElement campoPrecio;
	
	
}
