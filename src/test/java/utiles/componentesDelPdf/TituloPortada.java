package utiles.componentesDelPdf;

public enum TituloPortada {
	
	TITULO_COMPRAS_MOVIlES("REALIZACION DE COMRPA DE DISPOSITIVOS MOVILES"),
	TITULO_COMPRAS_ORDENADORES("REALIZACION DE COMRPA DE ORDENADORES"),
	TITULO_RESGISTRO("REALIZACION DEL REGISTRO"),
	TITULO_LOGIN("REALIZACION DEL LOGIN"),
	TITULO_CESTA("CESTA"),
	TITULO_TABLA("MOVILES PRECIOS");
	  
	private String titulo;

//public static TituloPortada[] titulos = {
//		new TituloPortada(TituloPortada.TITULO_LOGIN_CORRECTO),
//		new TituloPortada(TituloPortada.TITULO_LOGIN_INCORRECTO)
//};
	TituloPortada(String titulo) {
		// TODO Auto-generated constructor stub
		this.titulo=titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}

}
