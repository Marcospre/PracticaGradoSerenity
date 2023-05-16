package utiles.componentesDelPdf;

public enum Usuario {

	 USUARIO_PRL1 ("Mark26"),
	 USUARIO_PRL2 ("MarkOS2"),
	 USUARIO_PRL3 ("Telefono"),
	 USUARIO_PRL4 ("Marcos");
	 
	public static Usuario USUARIOS[] = { USUARIO_PRL1, USUARIO_PRL2, USUARIO_PRL3, USUARIO_PRL4 };

	 
	 private String usuario;
	Usuario(String string) {
		// TODO Auto-generated constructor stub
		this.usuario=string;
	}
	
	public String getTexto() {
		return usuario;
	}
}
