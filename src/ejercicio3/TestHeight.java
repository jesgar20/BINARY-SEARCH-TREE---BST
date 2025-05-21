package ejercicio3;

public class TestHeight {
	public static void main(String[] args) {
		Height<Integer> arbol = new Height<>();
		
		try {
			int[] valores = {50, 30, 70, 20, 40, 60, 80};
			for (int v : valores) arbol.insert(v);
			
			 System.out.println("Altura total: " + arbol.height(50));
	         System.out.println("Altura desde nodo 30: " + arbol.height(30));
	         System.out.println("Altura desde nodo 90 (no existe): " + arbol.height(90));

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
