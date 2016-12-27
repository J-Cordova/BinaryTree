package com.company;

public class Main {

    public static void main(String[] args) {
	    BinarySearchTree binarySearchTree = new BinarySearchTree();
	    binarySearchTree.root = binarySearchTree.CreateTestData();

        System.out.println("Recursive In Order -----------");
        System.out.println();
        binarySearchTree.RecursiveInorder(binarySearchTree.root);

        System.out.println();
        System.out.println("Iterative In Order -----------");
        System.out.println();
        binarySearchTree.IterativeInorder(binarySearchTree.root);

        System.out.println("-------------------------------------------");


        System.out.println();
        System.out.println("Recursive Post Order ---------");
        System.out.println();
        binarySearchTree.RecursivePostorder(binarySearchTree.root);

        System.out.println();
        System.out.println("Iterative Post Order ---------");
        System.out.println();
        binarySearchTree.IterativePostorder(binarySearchTree.root);

        System.out.println("-------------------------------------------");

        System.out.println();
        System.out.println("Recursive Pre Order ----------");
        System.out.println();
        binarySearchTree.RecursivePreorder(binarySearchTree.root);

        System.out.println();
        System.out.println("Iterative Pre Order ----------");
        System.out.println();
        binarySearchTree.IterativePreorder(binarySearchTree.root);

    }
}
