package com.company;

public class Main {

    public static void main(String[] args) {
	    Tree tree = new Tree();
	    tree.root = tree.CreateTestData();

        System.out.println("In Order -----------");
        System.out.println();
        tree.RecursiveInorder(tree.root);

        System.out.println();
        System.out.println("In Order -----------");
        System.out.println();
        tree.IterativeInorder(tree.root);


        //System.out.println();
        //System.out.println("Post Order ---------");
        //System.out.println();
        //tree.RecursivePostorder(tree.root);
        //
        //
        //System.out.println();
        //System.out.println("Pre Order ----------");
        //System.out.println();
        //tree.RecursivePreorder(tree.root);

    }
}
