package ejercicio1;
import actividad5.LinkedBST;
public class CountNodesFrom<E extends Comparable<E>> extends LinkedBST<E> {

    public int countFrom(E x) {
        var node = findNode(getRoot(), x);
        return node == null ? 0 : countNodesRecursive(node);
    }

    private int countNodesRecursive(Node node) {
        if (node == null) return 0;
        var n = (LinkedBST<E>.Node) node;
        return 1 + countNodesRecursive(getLeft(node)) + countNodesRecursive(getRight(node));
    }

    private Node findNode(Node node, E x) {
        if (node == null) return null;
        int cmp = x.compareTo(getData(node));
        if (cmp < 0) return findNode(getLeft(node), x);
        else if (cmp > 0) return findNode(getRight(node), x);
        else return node;
    }
}
