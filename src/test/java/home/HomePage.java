package home;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


public class HomePage extends PageObject{
	
	@FindBy(xpath="(//a[normalize-space()='Sign up'])[1]")
	static WebElement REGISTRO;
	
	@FindBy(xpath="//a[@id='nameofuser']")
	static WebElement mensajeWelcome;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	static WebElement LOGIN;
	
	@FindBy(xpath="//a[@id='cartur']")
	static WebElement CESTA;
	
	@FindBy(xpath="//a[.='Home (current)']")
	static WebElement HOME;
	
	@FindBy(id="logout2")
	static WebElement LOGOUT;
	
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	static WebElement MONITORS;
	
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	static WebElement LAPTOPS;
	
	@FindBy(id="//a[contains(text(),'Phones')]")
	static WebElement PHONES;
	
	
	
	 public static ArrayList <WebElement>ENLACES=new ArrayList<WebElement>();
	 public static ArrayList <WebElement>CATEGORIAS=new ArrayList<WebElement>();
	  public static void cargarLosEnlaces() {
		  
		  ENLACES.add(HOME);
		  ENLACES.add(LOGIN);
		  ENLACES.add(CESTA);
		  ENLACES.add(REGISTRO);
		  ENLACES.add(LOGOUT);
	  }
	  
	  public static  void cargarLosEnlacesCategoria() {
		  CATEGORIAS.add(PHONES);
		  CATEGORIAS.add(LAPTOPS);
		  CATEGORIAS.add(MONITORS);
	  }
		 
}
