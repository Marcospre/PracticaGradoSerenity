package utiles.componentesDelPdf;

public enum Telefonos {

	 TELEFONO_PRL1 ("Telefono1"),
	 TELEFONO_PRL2 ("Telefono2"),
	 TELEFONO_PRL3 ("Telefono3");
	 
	public static Telefonos TELEFONOS[] = { TELEFONO_PRL1 , TELEFONO_PRL2, TELEFONO_PRL3};

	 
	 private String telefono;
	Telefonos(String string) {
		// TODO Auto-generated constructor stub
		this.telefono=string;
	}
	
	public String getTexto() {
		return telefono;
	}
}
