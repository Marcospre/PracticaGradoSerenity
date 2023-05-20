package utiles.componentesDelPdf;

public enum Ordenadores {

	 ORDENADOR1 ("Ordenador1"),
	 ORDENADOR2 ("Ordenador2"),
	 ORDENADOR3 ("Ordenador3");
	 
	public static Ordenadores ORDENADORES[] = { ORDENADOR1 , ORDENADOR2, ORDENADOR3};

	 
	 private String ordenador;
	Ordenadores(String string) {
		// TODO Auto-generated constructor stub
		this.ordenador=string;
	}
	
	public String getTexto() {
		return ordenador;
	}
}
