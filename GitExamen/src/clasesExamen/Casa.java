package clasesExamen;

public class Casa {

	private float superficie;
	private String calle;
	private int codigoPostal;
	
	/**
	 * Un equipo de limpiadores deja la casa libre de g�rmenes
	 * y desinfecta todas las superficies
	 */
	
	public void limpiarLaCasa(){
		
		String mensajito = mensaje();
		System.out.println(mensajito);
	}

	private String mensaje() {
		String mensajito="Te hemos limpiado la casa, est� desinfectada y nadie te ha robado";
		return mensajito;
	}
	
	
}
