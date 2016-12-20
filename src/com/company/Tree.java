package com.company;

public class Tree
{
    Node root = new Node("I Am Root", null, null);

    public Node getRoot()
    {
        return root;
    }

    public void setRoot(Node root)
    {
        this.root = root;
    }


    public Node CreateTestData()
    {
        Node node = new Node("test Root",
                            new Node("Left 1", new Node("left1  left", null,null), new Node("left1 right", null, null)),
                            new Node("Right 1", new Node("right  left", null,null), new Node("right1 right", null, null)));

        return node;
    }


    public void RecursiveInorder(Node node)
    {
        if (node == null)
            return;
        RecursiveInorder(node.getLeftChild());
        System.out.println(node.getData().toString());
        RecursiveInorder(node.getRightChild());
    }

    public void RecursivePreorder(Node node)
    {
        if (node == null)
            return;
        System.out.println(node.getData().toString());
        RecursivePreorder(node.getLeftChild());
        RecursivePreorder(node.getRightChild());
    }

    public void RecursivePostorder(Node node)
    {
        if (node == null)
            return;
        RecursivePostorder(node.getLeftChild());
        RecursivePostorder(node.getRightChild());
        System.out.println(node.getData().toString());
    }

    public void IterativeInorder(Node node)
    {

    }

    public void IterativePreorder(Node node)
    {

    }

    public void IterativePostorder(Node node)
    {

    }

    public Object Search()
    {
        return null;
    }
}
