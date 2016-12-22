package com.company;


public class Node
{
    private Object Data;
    private Node LeftChild;
    private Node RightChild;

    public Node()
    {
        Data = null;
        LeftChild = null;
        RightChild = null;
    }

    public Node(Object data, Node left, Node right)
    {
        Data = data;
        LeftChild = left;
        RightChild = right;
    }

    public Object getData()
    {
        return Data;
    }

    public void setData(Object data)
    {
        Data = data;
    }

    public Node getLeftChild()
    {
        return LeftChild;
    }

    public void setLeftChild(Node leftChild)
    {
        LeftChild = leftChild;
    }

    public Node getRightChild()
    {
        return RightChild;
    }

    public void setRightChild(Node rightChild)
    {
        RightChild = rightChild;
    }

    public int compareTo(Node node)
    {
        return Data.toString().compareTo(node.getData().toString());
    }
}
