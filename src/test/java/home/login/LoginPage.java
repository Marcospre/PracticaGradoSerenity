package home.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class LoginPage extends PageObject {
	
	@FindBy(xpath="//input[@id='loginusername']")
	static WebElement campoUsuario;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	static WebElement campoPassword;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	static WebElement loginButton;
}
