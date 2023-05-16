package modelos;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
	
	public String email;
	public String password;
	public String message;
	public static int contador=1;
	public static List<Usuarios> usuarios = new ArrayList<Usuarios>();
	
	public Usuarios(String email,String password) {
		this.email = email;
		this.password = password;
	
		
	}
	
	public static void agregarUsuario(Usuarios usuario) {
		usuarios.add(usuario);
	}
}

