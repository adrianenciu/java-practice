package com.adrianenciu.binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(50, "Boss");
        binaryTree.addNode(25, "The VP");
        binaryTree.addNode(15, "Office Manager");
        binaryTree.addNode(30, "Secretary");
        binaryTree.addNode(75, "Manager");
        binaryTree.addNode(85, "Salesman 1");

        System.out.println("In Order Traverse Tree:");
        binaryTree.inOrderTraverseTree(binaryTree.getRoot());

        System.out.println("------------------------------");

        System.out.println("Pre Order Traverse Tree:");
        binaryTree.preOrderTraverseTree(binaryTree.getRoot());

        System.out.println("------------------------------");

        System.out.println("Post Order Traverse Tree:");
        binaryTree.postOrderTraverseTree(binaryTree.getRoot());

        System.out.println("------------------------------");

        System.out.println("Find node by key success: ");
        System.out.println(binaryTree.findNode(30));

        System.out.println("------------------------------");

        System.out.println("Find node by key failure: ");
        System.out.println(binaryTree.findNode(74));
    }

}
