package ejercicio1;
import actividad5.LinkedBST;

public class CountAllNodes<E extends Comparable<E>> extends LinkedBST<E> {
	
	public int countAllNodes() {
		return countNodesRecursive(getRoot());
	}
	
	private int countNodesRecursive(Node node) {
		if (node == null) return 0;
		return 1 + countNodesRecursive(getLeft(node)) + countNodesRecursive(getRight(node)); 
	}
}
