package home.cesta;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/cart.html")
public class CestaPage extends PageObject {
	
	@FindBy(xpath="//tbody")
	static WebElement table;
}
