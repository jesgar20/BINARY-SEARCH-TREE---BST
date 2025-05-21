// Paquete: actividad5
package actividad5;

import actividad3.BinarySearchTree;
import actividad4.ExceptionIsEmpty;
import actividad4.ItemDuplicated;
import actividad4.ItemNotFound;


 //Actividad 5: Implementación del árbol binario de búsqueda
 
public class LinkedBST<E extends Comparable<E>> implements BinarySearchTree<E> {

    //clase interna para representar nodos del árbol
    protected class Node {
        protected E data;
        protected Node left, right;

        Node(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    protected Node root;

    public LinkedBST() {
        this.root = null;
    }

    public void insert(E data) throws ItemDuplicated {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, E data) throws ItemDuplicated {
        if (node == null) return new Node(data);
        int cmp = data.compareTo(node.data);
        if (cmp < 0) node.left = insertRec(node.left, data);
        else if (cmp > 0) node.right = insertRec(node.right, data);
        else throw new ItemDuplicated("Elemento duplicado: " + data);
        return node;
    }

    public void delete(E data) throws ItemNotFound, ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("El árbol está vacío");
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node node, E data) throws ItemNotFound {
        if (node == null) throw new ItemNotFound("Elemento no encontrado: " + data);
        int cmp = data.compareTo(node.data);
        if (cmp < 0) node.left = deleteRec(node.left, data);
        else if (cmp > 0) node.right = deleteRec(node.right, data);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            node.data = findMin(node.right).data;
            node.right = deleteRec(node.right, node.data);
        }
        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public boolean search(E data) throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("El árbol está vacío");
        return searchRec(root, data);
    }

    private boolean searchRec(Node node, E data) {
        if (node == null) return false;
        int cmp = data.compareTo(node.data);
        if (cmp < 0) return searchRec(node.left, data);
        else if (cmp > 0) return searchRec(node.right, data);
        else return true;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public String inOrder() {
        return inOrderRec(root).trim();
    }

    private String inOrderRec(Node node) {
        if (node == null) return "";
        return inOrderRec(node.left) + node.data + " " + inOrderRec(node.right);
    }

    public String preOrder() {
        return preOrderRec(root).trim();
    }

    private String preOrderRec(Node node) {
        if (node == null) return "";
        return node.data + " " + preOrderRec(node.left) + preOrderRec(node.right);
    }

    public String postOrder() {
        return postOrderRec(root).trim();
    }

    private String postOrderRec(Node node) {
        if (node == null) return "";
        return postOrderRec(node.left) + postOrderRec(node.right) + node.data + " ";
    }

    //todos protegidos para ejercicios
    protected Node getRoot() {
        return root;
    }

    protected Node getLeft(Node node) {
        return node.left;
    }

    protected Node getRight(Node node) {
        return node.right;
    }

    protected E getData(Node node) {
        return node.data;
    }
}

