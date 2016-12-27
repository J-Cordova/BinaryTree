package com.company;


public class Node
{
    private int Data;
    private Node LeftChild;
    private Node RightChild;

    public Node()
    {
        LeftChild = null;
        RightChild = null;
    }

    public Node(int data, Node left, Node right)
    {
        Data = data;
        LeftChild = left;
        RightChild = right;
    }

    public int getData()
    {
        return Data;
    }

    public void setData(int data)
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
        if (node.getData() == this.getData())
        {
            return 0;
        }
        else if(node.getData() > this.getData())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
