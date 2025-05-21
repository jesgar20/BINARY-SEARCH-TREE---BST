package actividad4;

//Excepcion cuando no se encuentra un elemento en el arbol
public class ItemNotFound extends Exception {
	public ItemNotFound(String mensaje) {
		super(mensaje);
	}
}
