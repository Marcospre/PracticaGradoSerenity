package modelos;

import java.util.ArrayList;
import java.util.List;

public class Login {

	
	public String nombre;
	public String password;
	
	public Login(String nombre, String password) {
		this.nombre=nombre;
		this.password=password;
		
		}

	
	
	
	public static List<Login>LISTA_DE_LOGIN=new ArrayList<Login>();

	
	public static void agregar(Login usuario) {
		LISTA_DE_LOGIN.add(usuario);
	}
}
