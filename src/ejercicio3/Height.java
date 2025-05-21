package ejercicio3;
import actividad5.LinkedBST;

public class Height<E extends Comparable<E>> extends LinkedBST<E> {
	
	//calcula la altura del subarbol cuya raiz es el nodo con el valor X
	public int  height(E x) {
		Node nodo = findNode(getRoot(), x);
		return nodo == null ? -1 : heightRec(nodo);
	}
	
	private int heightRec(Node node) {
		if (node == null) return -1;
		int leftH = heightRec(getLeft(node));
		int rightH = heightRec(getRight(node));
		return 1 + Math.max(leftH, rightH);
	}
	
	private Node findNode(Node node, E x) {
		if (node == null) return null;
		int cmp = x.compareTo(getData(node));
		if (cmp < 0) return findNode(getLeft(node), x);
		else if (cmp >0) return findNode(getRight(node), x);
		else return node;
	}
}
