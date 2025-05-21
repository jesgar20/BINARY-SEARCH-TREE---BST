package ejercicio1;

public class TestCountNodes {
	public static void main(String[] args) {
		CountAllNodes<Integer> treeAll = new CountAllNodes<>();
		CountNodesFrom<Integer> treeFrom = new CountNodesFrom<>();
		
		try {
			//inserta los mismos nodos en ambos arboles
			int[] valores = {50, 30, 70, 20, 40, 60, 80};
			for (int val:valores) {
				treeAll.insert(val);
				treeFrom.insert(val);
			}
			
			System.out.println("[CountAllNodes] Total de nodos: " + treeAll.countAllNodes());
			System.out.println("[CountAllNodes] Nodos a partir de 30: " + treeFrom.countFrom(30));
			System.out.println("[CountAllNodes] Nodos a partir de 100 (no existe): " + treeFrom.countFrom(100));
		} catch (Exception e) {
			System.out.println("Error en prueba:" + e.getMessage());
		}
	}

}
