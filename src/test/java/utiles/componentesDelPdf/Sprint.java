package utiles.componentesDelPdf;

public enum Sprint {

	Sprint1("Sprint 1"),
	Sprint2("Sprint 2"),
	Sprint3("Sprint 3"),
	Sprint4("Sprint 4");
	
	private String titulo;
	Sprint(String titulo) {
		// TODO Auto-generated constructor stub
		this.titulo=titulo;
	}
	
	public String getTexto() {
		return titulo;
	}
}
