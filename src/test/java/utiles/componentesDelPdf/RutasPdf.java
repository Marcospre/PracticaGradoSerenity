package utiles.componentesDelPdf;

public enum RutasPdf {

//definimos las rutas donde se van a almacenar los pdf al finalizar la ejecucion	
 //RUTA_PDF_LOGIN_FINAL(PdfLogin.Ruta_Archivo+"Final.pdf"),   
// RUTA_PDF_EVALUACIONES_CONSULTAEVALUACION_IGN_IGCT(Pdf_IGN_IGCT.Ruta_Archivo+"Final.pdf"),
 RUTA_PDF_DOCUMENTACION_COORDINACIONCLIENTE_CONSULTA_DOCUMENTOS_FINAL ("./documentos/documentacion/coordinacion_cliente/consulta_documentos/descargarConsultaDocumentosFinal.pdf"),
 RUTA_PDF_DOCUMENTACION_COORDINACIONCLIENTE_COORDINACION_FINAL ("./documentos/documentacion/coordinacion_cliente/coordinacion/descargarCoordinacionFinal.pdf"),
 RUTA_PDF_EVALUACIONES_CONSULTAEVALUACION_IGN_Boton1_FINAL ("./documentos/evaluaciones/consulta_evaluacion/ign/boton1/descargarIGNFinal.pdf"),
 RUTA_PDF_EVALUACIONES_CONSULTAEVALUACION_IGN_Boton2_FINAL ("./documentos/evaluaciones/consulta_evaluacion/ign/boton2/descargarIGNFinal.pdf"),
 RUTA_PDF_EVALUACIONES_CONSULTAEVALUACION_IGCT_FINAL ("./documentos/evaluaciones/consulta_evaluacion/igct/descargarIGCTFinal.pdf"),
 RUTA_PDF_HERRAMIENTAS_ADMINISTRACION_INSTRUCIONESGUIAS_FINAL ("./documentos/herramientas/administracion/instrucciones_Guias/descargarInstruccionesGuiasFinal.pdf"),
 RUTA_PDF_DOCUMENTACION_FORMULARIOADIESTRAMIENTO_FINAL("./documentos/Documentacion/Asociacion_Empleado_Puesto/FormularioAdiestramiento/descargarFormularioFinal.pdf");
	

private String rutaFinal;

RutasPdf(String ruta) {

	this.rutaFinal=ruta;
}

public String getTexto() {
	return rutaFinal;
}
}
