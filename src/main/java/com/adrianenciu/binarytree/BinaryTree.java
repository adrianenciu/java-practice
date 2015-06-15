package com.adrianenciu.binarytree;

public class BinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void addNode(int key, String value) {
        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.getKey()) {
                    focusNode = focusNode.getLeftChild();
                    if (focusNode == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else if (key > focusNode.getKey()) {
                    focusNode = focusNode.getRightChild();
                    if (focusNode == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.getLeftChild());
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.getRightChild());
        }
    }

    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.getLeftChild());
            preOrderTraverseTree(focusNode.getRightChild());
        }
    }

    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.getLeftChild());
            postOrderTraverseTree(focusNode.getRightChild());
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;

        if (focusNode == null) {
            return null;
        }

        while (focusNode.getKey() != key) {
            if (key < focusNode.getKey()) {
                focusNode = focusNode.getLeftChild();
            } else {
                focusNode = focusNode.getRightChild();
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    public void removeNode() {

    }
}
