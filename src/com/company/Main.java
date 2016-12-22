package com.company;

public class Main {

    public static void main(String[] args) {
	    Tree tree = new Tree();
	    tree.root = tree.CreateTestData();

        System.out.println("Recursive In Order -----------");
        System.out.println();
        tree.RecursiveInorder(tree.root);

        System.out.println();
        System.out.println("Iterative In Order -----------");
        System.out.println();
        tree.IterativeInorder(tree.root);

        System.out.println("-------------------------------------------");


        System.out.println();
        System.out.println("Recursive Post Order ---------");
        System.out.println();
        tree.RecursivePostorder(tree.root);

        System.out.println();
        System.out.println("Iterative Post Order ---------");
        System.out.println();
        tree.IterativePostorder(tree.root);

        System.out.println("-------------------------------------------");

        System.out.println();
        System.out.println("Recursive Pre Order ----------");
        System.out.println();
        tree.RecursivePreorder(tree.root);

        System.out.println();
        System.out.println("Iterative Pre Order ----------");
        System.out.println();
        tree.IterativePreorder(tree.root);

    }
}
