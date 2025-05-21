package ejercicio2;

public class TestDestroyNodes {
	public static void main(String[] args) {
		DestroyNodes <Integer> arbol = new DestroyNodes<>();
		
		try {
			arbol.insert(10);
			arbol.insert(5);
			arbol.insert(15);
			arbol.insert(3);
			arbol.insert(7);
			
			System.out.println("InOrden antes de destruir: " + arbol.inOrder());
			arbol.destroyNodes();
			System.out.println("Arbol destruido?: " + arbol.isDestroyed());
		} catch (Exception e) {
			System.out.println("Error en prueba: " + e.getMessage());
		}
	}

}
