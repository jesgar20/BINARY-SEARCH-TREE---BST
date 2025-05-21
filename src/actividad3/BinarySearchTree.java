package actividad3;
import actividad4.ExceptionIsEmpty;
import actividad4.ItemDuplicated;
import actividad4.ItemNotFound;
//interfaz del arbol binario de busqueda
public interface BinarySearchTree<E extends Comparable<E>> {
	void insert (E data) throws ItemDuplicated;
	void delete (E data) throws ItemDuplicated, ExceptionIsEmpty, ItemNotFound;
	boolean search (E data) throws ExceptionIsEmpty;
	String inOrder();
	String preOrder();
	String postOrder();
}
