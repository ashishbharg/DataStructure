package edu.ashish.tree;

/**
 * Created by ashish.bhargava on 10/8/2017.
 */
public class BST<K extends Comparable<K>, V> {

    private Node root;

    private class Node {
        private K key;
        private V value;
        private Node left;
        private Node right;
        private int count;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    public V get(K key) {
        if(null == key || null == root) {
            return null;
        }
        Node node = root;
        while(null != node) {
            int c = key.compareTo(node.key);
            if (c < 0) node = node.left;
            else if (c > 0) node = node.right;
            else return node.value;
        }
        return null;
    }

    public void put(K key, V value) {
        root = put(key, value, root);
    }

    private Node put(K key, V value, Node node) {
        if(null == node) {
            return new Node(key, value);
        }
        int c = key.compareTo(node.key);
        if(c < 0) node.left = put(key, value, node.left);
        else if(c > 0) node.right = put(key, value, node.right);
        else node.value = value;
        node.count = 1 + size(node.left) + size(node.right);
        return node;
    }

    public void delete(K key) {
        delete(root, key);
    }

    private Node delete(Node node, K key) {
        if(null == node || null == key)
            return null;
        int cmp = key.compareTo(node.key);
        if(cmp < 0) node.left = delete(node.left, key);
        else if(cmp > 0) node.right = delete(node.right, key);
        else {
            if(null == node.right) return node.left;
            else if(null == node.left) return node.right;
            Node n = node;
            node = min(n.right);
            node.right = deleteMin(n.right);
            node.left = n.left;
        }
        return node;

    }

    private Node min(Node node) {
        while(null != node.left) {
            node = node.left;
        }
        return node;
    }

    public void deleteMax() {
        Node node = deleteMax(root);
    }

    private Node deleteMax(Node node) {
        if(null == node.right) return node.left;
        node.right = deleteMin(node.right);
        node.count = 1 + size(node.left) + size(node.right);
        return node;
    }

    public void deleteMin() {
        Node node = deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if(null == node.left) return node.right;
        node.left = deleteMin(node.left);
        node.count = 1 + size(node.left) + size(node.right);
        return node;
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    public void inOrder(Node node) {
        if(null == node)
            return;
        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    public void preOrder(Node node) {
        if(null == node)
            return;
        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    public void postOrder(Node node) {
        if(null == node)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
    }

    public void levelOrder() {
        int height = findHeight(root);
        for(int i=1; i<= height; i++)
            levelOrder(root, i);
        System.out.println();
    }

    public void levelOrder(Node node, int height) {

        if(null == node) {
            return;
        }
        if(1 == height) {
             System.out.print(node.key + " ");
        } else {
            levelOrder(node.left, height - 1);
            levelOrder(node.right, height - 1);
        }

    }

    private int findHeight(Node node) {
        if(null == node) {
            return 0;
        }
        int lHeight = findHeight(node.left);
        int rHeight = findHeight(node.right);
        if(lHeight > rHeight) {
            return lHeight + 1;
        } else {
            return rHeight + 1;
        }
    }

    public int size() {
        return size(root);
    }

    public int size(Node node) {
        if(null == node) {
            return 0;
        }
        return node.count;
    }

    public Node min() {
        Node node = root;
        while(null != node.left) {
            node = node.left;
        }
        return node;
    }

    public Node max() {
        Node node = root;
        while(null != node.right) {
            node = node.right;
        }
        return node;
    }

    public K floor(K key) {
        Node node = floor(root, key);
        if(null == node)
            return null;
        return node.key;
    }

    private Node floor(Node node, K key) {
        if(null == node || null == key) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if(cmp == 0) return node;
        else if(cmp < 0) return floor(node.left, key);
        Node n = floor(node.right, key);
        if(null != n) return n;
        return node;
    }

    public K ceiling(K key) {
        Node node = ceiling(root, key);
        if(null == node)
            return null;
        return node.key;
    }

    private Node ceiling(Node node, K key) {
        if(null == node || null == key) {
            return null;
        }
        int cmp = key.compareTo(node.key);

        if(cmp == 0) return node;
        else if(cmp > 0) return ceiling(node.right, key);
        Node n = ceiling(node.left, key);
        if(null != n) return n;
        return node;
    }

    public int rank(K key) {
        return rank(root, key);
    }

    private int rank(Node node, K key) {
        if(null == node || null == key)
            return 0;
        int cmp = key.compareTo(node.key);
        if(cmp < 0) return rank(node.left, key);
        else if(cmp > 0) return 1 + size(node.left) + rank(node.right, key);
        else return size(node.left);
    }

    public static void main(String[] args) {
        BST<String, Integer> bst = new BST<>();
        bst.put("P",3);
        bst.put("G",3);
        bst.put("T",3);
        bst.put("Q",3);
        bst.put("D",3);
        bst.put("J",3);
        bst.put("F",3);
        bst.put("A",3);
        bst.put("L",3);
        bst.put("Z",3);
        bst.put("H",3);
        bst.put("I",3);
        System.out.println("In Order Traversal");
        bst.inOrder();
        System.out.println("Pre Order Traversal");
        bst.preOrder();
        System.out.println("Post Order Traversal");
        bst.postOrder();
        System.out.println("Level Order Traversal");
        bst.levelOrder();
        bst.delete("G");
        System.out.println("Level Order Traversal After Deletion");
        bst.levelOrder();


    }
}

