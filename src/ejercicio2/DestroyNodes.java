package ejercicio2;
import actividad5.LinkedBST;

//clase que implementa el metodo destroyNodes para eliminar los nodos del arbol
public class DestroyNodes<E extends Comparable<E>> extends LinkedBST<E> {
	public void destroyNodes() {
		root = null; //con poner la raiz en null para que el recolector de basura elimine todos los nodos
	}
	
	public boolean isDestroyed() {
		return root == null;
	}
}
