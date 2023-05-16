package utiles.componentesDelPdf;

public enum Descripcion {

	DESCRIPCION_REGISTRO("mostramos los pasos para verificar la prueba de registrase en la pagina"),
	DESCRIPCION_LOGIN("mostramos los pasos para verificar la prueba de logearse correctamente en la pagina"),
	DESCRIPCION_CESTA("comprobamos que al añadir un telefono a la cesta se agrega correctamente"),
	DESCRIPCION_TABLA("Documento que muestra los moviles que hay en la cesta del usuario ordenados por precio"),
	DESCRIPCION_COMPRA_MOVILES("Compra un dispositivo movily se comprueba que se haya añadido a la cesta"),
	DESCRIPCION_COMPRA_ORDENADORES("Compra un ordenador y se comprueba que se haya añadido a la cesta");

private String descripcion;

Descripcion(String descripcion) {
	// TODO Auto-generated constructor stub
	this.descripcion=descripcion;

}

public String getDescripcion() {
	return descripcion;
}
}
