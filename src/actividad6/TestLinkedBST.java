package actividad6;

import actividad5.LinkedBST;
import actividad4.ItemDuplicated;
import actividad4.ItemNotFound;
import actividad4.ExceptionIsEmpty;

public class TestLinkedBST {
	public static void main(String[] args) {
        try {
            LinkedBST<Integer> arbol = new LinkedBST<>();

            // Insertar elementos
            arbol.insert(50);
            arbol.insert(30);
            arbol.insert(70);
            arbol.insert(20);
            arbol.insert(40);
            arbol.insert(60);
            arbol.insert(80);

            // Mostrar recorridos
            System.out.println("Recorrido InOrder: " + arbol.inOrder());
            System.out.println("Recorrido PreOrder: " + arbol.preOrder());
            System.out.println("Recorrido PostOrder: " + arbol.postOrder());

            // Buscar elementos
            System.out.println("¿Existe 60?: " + arbol.search(60));
            System.out.println("¿Existe 90?: " + arbol.search(90));

            // Eliminar un nodo
            arbol.delete(30);
            System.out.println("InOrder después de eliminar 30: " + arbol.inOrder());

        } catch (ItemDuplicated | ItemNotFound | ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
